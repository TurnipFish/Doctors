package com.example.doctors.network

import androidx.annotation.Nullable
import com.example.doctors.model.apiObjects.DoctorsSearch
import io.reactivex.Flowable
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.*

interface IContentDownloaderService {
    @Streaming
    @Headers(
        "Accept: application/json"
    )
    @GET("doctors")
    fun getContent(@Header("Authorization") accessToken : String,
                                @Query("lastKey") lastKey: String?,
                                @Query("latDelta") latDelta: Double,
                                @Query("lngDelta") lngDelta: Double,
                                @Query("location") location: String?,
                                @Query("search")  search: String?,
                                @Query("sort") sort: String?): Observable<DoctorsSearch>


}
