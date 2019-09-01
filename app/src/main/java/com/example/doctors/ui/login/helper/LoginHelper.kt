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
                               val application: MyApplication,
                              val restApi: RestApi,
                               var mHandler: Handler) : DataFetchHelper(), ILoginHelper {
    var check: Boolean = true

    inner class Runner(val response: Int) : Runnable{

        override fun run() {
            check = checkStatusCode(response)
            if ( check){
                startNewActivity<LoginActivity, DoctorsActivity>(DoctorsActivity::class.java)

            } else {
                ctx?.let{
                    showDialog(it.resources.getString(R.string.auth_header),
                        it.resources.getString(R.string.auth_login_error))
                }
            }
        }
    }

//===============================================End Handlers==============================================//
    override fun login(email: String, password: String) {
            restApi.generateObservableStreamForAuthentication(this, application, mHandler, downloader, email, password)
    }
}