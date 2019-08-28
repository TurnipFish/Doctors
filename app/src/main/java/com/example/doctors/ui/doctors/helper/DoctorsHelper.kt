package com.example.doctors.ui.doctors.helper

import android.annotation.SuppressLint
import android.os.Handler
import android.os.Message
import com.example.doctors.R
import com.example.doctors.MyApplication
import com.example.doctors.network.IContentDownloaderService
import com.example.doctors.network.RestApi
import com.example.doctors.ui.doctors.DoctorsActivity
import com.example.doctors.util.general.DataFetchHelper
import com.google.android.material.snackbar.Snackbar

class DoctorsHelper(val application: MyApplication,
                                    val downloader: IContentDownloaderService) : DataFetchHelper(), IDoctorsHelper {

    val mHandler = @SuppressLint("HandlerLeak") object : Handler(){
        override fun handleMessage(msg: Message?) {
            super.handleMessage(msg)
            val check = checkStatusCode(msg?.arg1)
            (ctx as DoctorsActivity).swipeRefresh.isRefreshing = false      //reset swipe refreshing
            if ( check){
                (ctx as DoctorsActivity).initRecyclerView()
            } else {
                ctx?.let{
                    mView?.let{
                        Snackbar.make(it, it.resources.getString(R.string.doctors_fetch_content_error), Snackbar.LENGTH_LONG).show()}}
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
        RestApi.generateObservableStreamForDoctors(application, mHandler, downloader, search, location)
    }

}