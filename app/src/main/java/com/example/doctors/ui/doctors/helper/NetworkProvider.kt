package com.example.doctors.ui.doctors.helper

import com.example.doctors.MyApplication
import com.example.doctors.ui.doctors.DoctorsScope
import com.example.doctors.util.preferences.MyPreferencesHelper
import dagger.Provides
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor

class NetworkProvider {
       lateinit var  mApplication: MyApplication

        fun setApplication(application: MyApplication){
            this.mApplication = application
        }

        fun provideClient() : OkHttpClient {
            mApplication?.let{
                val token= MyPreferencesHelper.getToken(mApplication)
                val interceptor = HttpLoggingInterceptor()
                interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC)

                return OkHttpClient.Builder().addInterceptor(interceptor).addInterceptor(object: Interceptor {
                    override fun intercept(chain: Interceptor.Chain): Response {
                        var request : Request = chain.request()
                        request = request.newBuilder()
                        .addHeader("accept", "application/json")
                        .addHeader("Authorization", "Bearer $token")
                        .build()
                        return chain.proceed(request)
                    }
                }).build()
            }
        }

}