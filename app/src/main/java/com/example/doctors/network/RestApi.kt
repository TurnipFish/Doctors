package com.example.doctors.network

import com.example.doctors.MyApplication
import com.example.doctors.model.apiObjects.Authentication
import com.example.doctors.util.preferences.MyPreferencesHelper
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import timber.log.Timber
import android.os.Handler
import android.os.Message
import  io.reactivex.functions.Function
import com.example.doctors.model.Doctor
import com.example.doctors.model.apiObjects.DoctorsSearch
import com.example.doctors.model.apiObjects.ApiDoctor
import com.example.doctors.util.data.MyContentDataSource
import io.reactivex.ObservableSource
import io.realm.Realm

class RestApi {
    var success: Boolean = false
    var recordsCounter: Int = 0
    var dataFetchSuccess: Boolean = true
    /**
     * Create a single Observable streamer for authentication
     *
     * @param View context
     * @param iService the applied API service
     * @param mHandler - Hanlder to caller
     * @param email - user email
     * @param password - user password
     */
    fun generateObservableStreamForAuthentication(
        application: MyApplication,
        mHandler: Handler,
        iService: ITokenDownloaderService,
        email: String,
        password: String
    ) {

        val observable = iService?.getToken(
            email,
            password
        )

        observableStreamerSubscriber(application, mHandler, observable)
    }

    fun observableStreamerSubscriber(
        application: MyApplication,
        mHandler: Handler,
        observable: Observable<Authentication>
    ) {
        var disposable: Disposable? = null
        try {
            observable?.let {
                disposable = observable.subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .doOnComplete { }
                    .subscribeWith(object : DisposableObserver<Authentication>() {

                        override fun onComplete() {
                            Timber.i("Authentication process ended! ")
                            when (success) {
                                true -> {
                                    sendMessage(mHandler, MyContentDataSource.NETWORK_STATUS_OK)
                                }
                                false -> {
                                    sendMessage(mHandler, MyContentDataSource.NETWORK_STATUS_ERROR)
                                }
                            }
                        }

                        override fun onNext(t: Authentication) {
                            t.getToken()?.let {
                                MyPreferencesHelper.setToken(it, application)
                                success = true
                            }
                        }

                        override fun onError(e: Throwable) {
                            Timber.e(
                                "Fail to subscribe to flowable  with message:  <%s> ",
                                e.message
                            )
                        }
                    })
            }
        } catch (e: Exception) {
            Timber.e("Fail to subscribe to flowable with message:  <%s> ", e.printStackTrace())
        }
    }

    /**
     * Create a single Observable streamer for authentication
     *
     * @param  View context
     * @param iService the applied API service
     * @param mHandler - Hanlder to caller
     * @param search - ApiDoctor name
     * @param location - location at the center of a circle in which search is  conducted
     */
    fun generateObservableStreamForDoctors(
        application: MyApplication, mHandler: Handler, iService: IContentDownloaderService,
        search: String?, location: String?) {

       val observable = iService?.getContent(
            "Bearer ${MyPreferencesHelper.getToken(application)}",
            MyPreferencesHelper.getLastKey(application)?: " ",
            MyContentDataSource.LAT_DELTA,
            MyContentDataSource.LNG_DELTA,
            location?: " ",
            search?: " ",
            "distance"
        )

        val doctorsObservable =
            observable.flatMap (object: Function<DoctorsSearch, ObservableSource<ApiDoctor>> {
                override fun apply(doctorsSearch: DoctorsSearch): Observable<ApiDoctor> {
                     MyPreferencesHelper.setLastKey(doctorsSearch.getLastKey(), application)
                   return Observable.fromIterable(doctorsSearch.getDoctors())
                }
            })


        //subscriberToLastKeyObservable(application, mHandler, observable)
        subscriberToDoctorsObservable(application, mHandler, doctorsObservable)
    }

    /**
     * Subscriber to the Doctors observable
     * @param application
     * @param mHandler - Handler to the caller
     * @Param observable - emitter of ApiDoctor objects
     */
    fun subscriberToDoctorsObservable(
        application: MyApplication,
        mHandler: Handler,
        observable: Observable<ApiDoctor>
    ) {
        var disposable: Disposable? = null
        try {
            observable?.let {
                disposable = observable.subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .doOnComplete { }
                    .subscribeWith(object : DisposableObserver<ApiDoctor>() {

                        override fun onComplete() {
                            Timber.i("Authentication process ended! ")
                            sendMessage(mHandler, MyContentDataSource.NETWORK_STATUS_OK)
                        }

                        override fun onNext(apiDoctor: ApiDoctor) {
                            apiDoctor?.let{addDoctorToRealm(apiDoctor)}
                        }

                        override fun onError(e: Throwable) {
                            Timber.e("Fail to subscribe to flowable  with message:  <%s> ", e.message )
                           // sendMessage(mHandler, MyContentDataSource.NETWORK_STATUS_ERROR)
                        }
                    })
            }
        } catch (e: Exception) {
            Timber.e("Fail to subscribe to Observable with message:  <%s> ", e.printStackTrace())
            sendMessage(mHandler, MyContentDataSource.NETWORK_STATUS_ERROR)
        }
    }

    /**
     * transmit a message to an Handler in the MainThread waiting for a task executed on
     * a working thread to finish
     *
     * @param mHandler The Handler which belongs to the MainThread
     * @param statusCode The message content success/failure
     */
    fun sendMessage(mHandler: Handler, statusCode: Int) {
        val msg = Message()
        msg.arg1 = statusCode
        mHandler.sendMessage(msg)
    }
    /**
     * add a doctor object to Realm
     *
     * @param apiDoctor An doctor object
     */
    fun addDoctorToRealm(apiDoctor: ApiDoctor) {
        val realm = Realm.getDefaultInstance()
        val dbDoctor = Doctor()
        addToRealmDoctor(apiDoctor, dbDoctor)
        realm.beginTransaction()
            val managedDoctor = realm.copyToRealmOrUpdate(dbDoctor)
        realm.commitTransaction()

    }
    /**
     * copy doctor details to a doctor  Realm object
     *
     * @param apiDoctor An doctor object
     * @param dbDoctor a realm doctor object
     */
    fun addToRealmDoctor(apiDoctor: ApiDoctor, dbDoctor: Doctor)  {
         apiDoctor.getId()?.let{
             dbDoctor.setId(it)
             dbDoctor.setName(apiDoctor.getName())
             dbDoctor.setAddress(apiDoctor.getAddress())
             dbDoctor.setPhotoId(apiDoctor.getPhotoId())
         }
    }

}