package com.example.doctors.network

import io.reactivex.Flowable
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Streaming
import retrofit2.http.Url

interface IImageDownloaderService {
    @Streaming
    @GET
    fun getContent(@Url url : String): Flowable<Response<ResponseBody>>
}