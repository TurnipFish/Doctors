package com.example.doctors.root

import com.example.doctors.MyApplication
import com.example.doctors.network.ApiModuleForFetchingContent
import com.example.doctors.network.IContentDownloaderService
import com.example.doctors.network.IImageDownloaderService
import com.example.doctors.network.ITokenDownloaderService
import javax.inject.Singleton
import dagger.Component

@Singleton
@Component(modules = [ApplicationModule::class, ApiModuleForFetchingContent::class])
interface ApplicationComponent {

     fun inject(target: MyApplication)
     fun application(): MyApplication
     fun contentDownloaderService(): IContentDownloaderService
     fun imageDownloaderService(): IImageDownloaderService
     fun tokenDownaloderService(): ITokenDownloaderService
}