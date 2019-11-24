package com.example.doctors.root

import com.example.doctors.MyApplication
import com.example.doctors.model.MyRealmQueries
import com.example.doctors.network.*
import javax.inject.Singleton
import dagger.Component

@Singleton
@Component(modules = [ApplicationModule::class, ApiModuleForFetchingContent::class])
interface ApplicationComponent {

     fun inject(target: MyApplication)
     fun application(): MyApplication
     fun restApi(): RestApi
     fun myRealmQueries(): MyRealmQueries
     fun contentDownloaderService(): IContentDownloaderService
     fun imageDownloaderService(): IImageDownloaderService
     fun tokenDownaloderService(): ITokenDownloaderService
}