package com.example.doctors.ui.login

import com.example.doctors.MyApplication
import com.example.doctors.network.ITokenDownloaderService
import com.example.doctors.network.RestApi
import com.example.doctors.ui.login.helper.LoginHelper
import dagger.Module
import dagger.Provides


@Module
class LoginModule() {

    @LoginScope
    @Provides
    fun provideLoginPresenter(loginModel: LoginModel,loginHelper: LoginHelper) : LoginPresenter {
        return LoginPresenter(loginModel, loginHelper)
    }

    @LoginScope
    @Provides
    fun provideLoginModel(loginHelper: LoginHelper) : LoginModel {
        return LoginModel(loginHelper)
    }

    @LoginScope
    @Provides
    fun provideLoginHelper(downloader: ITokenDownloaderService,
                           application: MyApplication,
                           restApi: RestApi) : LoginHelper {
        return LoginHelper(downloader, application, restApi)
    }
}