package com.example.doctors.ui.login.helper

import android.annotation.SuppressLint
import com.example.doctors.MyApplication
import com.example.doctors.R
import com.example.doctors.network.ITokenDownloaderService
import com.example.doctors.network.RestApi
import android.os.Handler
import android.os.Message
import com.example.doctors.ui.doctors.DoctorsActivity
import com.example.doctors.ui.login.LoginActivity
import com.example.doctors.util.general.DataFetchHelper

import com.google.android.material.snackbar.Snackbar

class LoginHelper(val downloader: ITokenDownloaderService,
                                 val application: MyApplication) : DataFetchHelper(), ILoginHelper {



    val mHandler = @SuppressLint("HandlerLeak") object : Handler(){
        override fun handleMessage(msg: Message?) {
            super.handleMessage(msg)
            val check = checkStatusCode(msg?.arg1)
            if ( check){
               startNewActivity<LoginActivity, DoctorsActivity>(DoctorsActivity::class.java)

            } else {
                ctx?.let{
                    mView?.let{
                    Snackbar.make(it, it.resources.getString(R.string.auth_login_error), Snackbar.LENGTH_LONG).show()}}
            }
        }
    }
//===============================================End Handlers==============================================//

    override fun login(email: String, password: String) {
            RestApi.generateObservableStreamForAuthentication(application, mHandler, downloader, email, password)
    }
}