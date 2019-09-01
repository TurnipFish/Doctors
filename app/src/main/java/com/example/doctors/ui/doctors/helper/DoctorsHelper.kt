package com.example.doctors.ui.doctors.helper

import android.annotation.SuppressLint
import android.os.Handler
import android.os.Message
import com.example.doctors.R
import com.example.doctors.MyApplication
import com.example.doctors.network.IContentDownloaderService
import com.example.doctors.network.RestApi
import com.example.doctors.ui.doctors.DoctorsActivity
import com.example.doctors.ui.login.LoginActivity
import com.example.doctors.util.general.DataFetchHelper
import com.google.android.material.snackbar.Snackbar

class DoctorsHelper(val application: MyApplication,
                                  val downloader: IContentDownloaderService,
                                  val restApi: RestApi,
                                  var mHandler: Handler) : DataFetchHelper(), IDoctorsHelper {
    var check: Boolean = true
    inner class Runner(val response: Int) : Runnable{

        override fun run() {
            check = checkStatusCode(response)
            (ctx as DoctorsActivity?)?.swipeRefresh?.isRefreshing = false      //reset swipe refreshing
            if ( check){
                (ctx as DoctorsActivity?)?.initRecyclerView()
            } else {
                ctx?.let{
                    showDialog(it.resources.getString(R.string.doctors_header),
                        it.resources.getString(R.string.doctors_fetch_content_error))
                }
            }
        }
    }

    //=======================================End Handlers===========================================//

    /**
     * calls the API for fetching doctors
     * @param search - Dr. name
     * @param location - The center of the  area to search in
     */
    override fun fetchDoctors(search: String?, location: String?){
        restApi.generateObservableStreamForDoctors(this, application, mHandler, downloader, search, location)
    }

}