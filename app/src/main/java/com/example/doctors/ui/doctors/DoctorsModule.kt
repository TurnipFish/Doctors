package com.example.doctors.ui.doctors

import android.os.Handler
import com.example.doctors.MyApplication
import com.example.doctors.model.MyRealmQueries
import com.example.doctors.network.IContentDownloaderService
import com.example.doctors.network.RestApi
import com.example.doctors.ui.doctors.helper.DoctorsHelper
import com.example.doctors.util.preferences.MyPreferencesHelper
import com.squareup.picasso.OkHttp3Downloader

import com.squareup.picasso.Picasso
import dagger.Module
import dagger.Provides
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import java.lang.invoke.MethodHandle

@Module
class DoctorsModule(val application: MyApplication) {

    @DoctorsScope
    @Provides
    fun provideDoctorsPresenter(doctorsModel: DoctorsModel) : DoctorsPresenter {
        return DoctorsPresenter(doctorsModel)
    }

    @DoctorsScope
    @Provides
    fun provideDoctorsModel(myRealmQueries: MyRealmQueries) : DoctorsModel {
        return DoctorsModel(myRealmQueries)
    }

    @DoctorsScope
    @Provides
    fun provideDoctorsHelper(application: MyApplication, downloader: IContentDownloaderService, restApi: RestApi, mHandleer: Handler   ) : DoctorsHelper {
        return DoctorsHelper(application, downloader, restApi, mHandleer )
    }

    @DoctorsScope
    @Provides
    fun providesHandler(): Handler {
        return Handler()
    }

    /**
     * Provide an OkHttpClient with specific accessibility headers for enabling images downloading
     */
    @DoctorsScope
    @Provides
    fun provideClient() : OkHttpClient {
        application?.let{
            val token= MyPreferencesHelper.getToken(application)
            val interceptor = HttpLoggingInterceptor()
            interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC)

            return OkHttpClient.Builder().addInterceptor(interceptor).addInterceptor(object: Interceptor {
                override fun intercept(chain: Interceptor.Chain): Response {
                    var request : Request = chain.request()
                    request = request.newBuilder()
                        .addHeader("Accept", " application/json")
                        .addHeader("Authorization", " Bearer $token")
                        .build()
                    return chain.proceed(request)
                }
            }).build()
        }
    }

    @DoctorsScope
    @Provides
    fun provideDownloader(): OkHttp3Downloader {
        return OkHttp3Downloader(provideClient())
    }

    @DoctorsScope
    @Provides
    fun providePicasso(): Picasso{
         val picasso  = Picasso.Builder(application).downloader(provideDownloader()).build()
        Picasso.setSingletonInstance(picasso)
        return picasso
    }
}