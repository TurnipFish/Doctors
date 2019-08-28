package com.example.doctors.network

import com.example.doctors.model.apiObjects.Authentication
import io.reactivex.Flowable
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.*

interface ITokenDownloaderService {
    @Streaming
    @FormUrlEncoded
    @Headers(
        "Content-Type:  application/x-www-form-urlencoded",
        "Accept: application/json",
        "Authorization: Basic aXBob25lOmlwaG9uZXdpbGxub3RiZXRoZXJlYW55bW9yZQ==")
    @POST("token?grant_type=password")
    fun getToken(@Field("username")  username: String,
                           @Field("password")  password: String): Observable<Authentication>
}



