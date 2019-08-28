package com.example.doctors.root

import com.example.doctors.MyApplication
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


}