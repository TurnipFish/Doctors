package com.example.doctors.root

import com.example.doctors.MyApplication
import com.example.doctors.model.MyRealmQueries
import com.example.doctors.network.RestApi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(var application: MyApplication) {

    //Inject a context of the application.
    @Provides
    @Singleton
    fun provideContext(): MyApplication {
        return this.application
    }

    //Inject a RestApi
    @Provides
    @Singleton
    fun provideRestApi(): RestApi {
        return RestApi()
    }

    //Inject a RestApi
    @Provides
    @Singleton
    fun provideMyRealmQueries(): MyRealmQueries  {
        return MyRealmQueries()
    }

}