package com.example.doctors.util.general

import android.content.Context
import android.view.View

interface IDataFetchHelper {

    fun setContext(context: Context)
    fun checkStatusCode(statusCode: Int?): Boolean
    fun setView(view: View)

}