package com.example.doctors.network

import dagger.Module
import dagger.Provides
import com.example.doctors.util.data.MyContentDataSource
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class ApiModuleForFetchingContent() {

    @Singleton
    @Provides
    fun provideClient() : OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC)

        return OkHttpClient.Builder().addInterceptor(interceptor).addInterceptor(object: Interceptor {
            override fun intercept(chain: Interceptor.Chain): Response {
                var request : Request = chain.request()
                val url : HttpUrl = request.url.newBuilder().build()
                request = request.newBuilder().url(url).build()
                return chain.proceed(request)
            }
        }).build()
    }

    @Singleton
    @Provides
    fun provideRetrofit(baseURL : String, client : OkHttpClient) : Retrofit {
        return Retrofit.Builder()
                .baseUrl(baseURL)
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())  //this helps to return the Observable values
                .addConverterFactory(GsonConverterFactory.create())             //convert JSON into Java objects
                .build()
    }

    /**
     * creates an Anonymous object of ITokenDownloaderService that performs the "GET" call for token
     * @return - GET request for token service
     */
    @Singleton
    @Provides
    fun provideApiServiceForToken() : ITokenDownloaderService {
        val BASE_URL = MyContentDataSource.BASE_URL_TOKEN
        return provideRetrofit(BASE_URL, provideClient()).create(ITokenDownloaderService::class.java)
    }

    /**
     *  creates an Anonymous object of IContentDownloaderService that performs the "GET" call for
     *  Doctors
     *   @return - GET request for doctors service
     */
    @Singleton
    @Provides
    fun provideApiServiceForDoctors() : IContentDownloaderService {
        val BASE_URL = MyContentDataSource.BASE_URL_DOCTORS
        return provideRetrofit(BASE_URL, provideClient()).create(IContentDownloaderService::class.java)
    }

    /**
     *  creates an Anonymous object of ITokenDownloaderService that performs the "GET" call for
     *  Doctors
     *   @return - GET request for image service
     */
    @Singleton
    @Provides
    fun provideApiServiceForImages() : IImageDownloaderService {
        val BASE_URL = MyContentDataSource.BASE_URL_TOKEN
        return provideRetrofit(BASE_URL, provideClient()).create(IImageDownloaderService::class.java)
    }

}

