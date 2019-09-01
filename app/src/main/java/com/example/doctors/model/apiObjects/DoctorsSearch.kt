package com.example.doctors.model.apiObjects

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class DoctorsSearch{

    @SerializedName("doctors")
    @Expose
    private var apiDoctors: List<ApiDoctor>? = null

    @SerializedName("lastKey")
    @Expose
    private var lastKey: String? = null

    fun getDoctors(): List<ApiDoctor>? { return apiDoctors}
    fun setDoctors(apiDoctors: List<ApiDoctor>? ){this.apiDoctors = apiDoctors}

    fun getLastKey(): String? { return lastKey}
    fun setLastKey(lastKey: String? ){this.lastKey = lastKey}
}