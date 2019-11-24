package com.example.doctors.util.preferences

import android.content.Context
import android.content.SharedPreferences
import com.example.doctors.MyApplication

object MyPreferencesHelper {
    private val TOKEN = "token"
    private val LAST_KEY = "last_key"

    fun getPreference(application: MyApplication): SharedPreferences {
        val sharedPref: SharedPreferences = application.getSharedPreferences(
            "mySharedPreferences", Context.MODE_PRIVATE)
        return sharedPref
    }

    /**
     * UserDetails
     * -----------
     * parameters:  token, last key
     */
    //Token
    fun setToken(token: String, application: MyApplication){
        this.getPreference(application).edit().putString(TOKEN, token).apply()
    }

    fun getToken(application: MyApplication): String? {
        return this.getPreference(application).getString(TOKEN, "")
    }
    //Last Key
    fun setLastKey(key: String?, application: MyApplication){
        this.getPreference(application).edit().putString(LAST_KEY, key).apply()
    }

    fun getLastKey(application: MyApplication): String? {
        return this.getPreference(application).getString(LAST_KEY, null)
    }

}