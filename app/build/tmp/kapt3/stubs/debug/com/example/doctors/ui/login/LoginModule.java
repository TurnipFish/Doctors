package com.example.doctors.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/example/doctors/ui/login/LoginModule;", "", "()V", "provideLoginHelper", "Lcom/example/doctors/ui/login/helper/LoginHelper;", "downloader", "Lcom/example/doctors/network/ITokenDownloaderService;", "application", "Lcom/example/doctors/MyApplication;", "provideLoginModel", "Lcom/example/doctors/ui/login/LoginModel;", "loginHelper", "provideLoginPresenter", "Lcom/example/doctors/ui/login/LoginPresenter;", "loginModel", "app_debug"})
@dagger.Module()
public final class LoginModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @LoginScope()
    public final com.example.doctors.ui.login.LoginPresenter provideLoginPresenter(@org.jetbrains.annotations.NotNull()
    com.example.doctors.ui.login.LoginModel loginModel, @org.jetbrains.annotations.NotNull()
    com.example.doctors.ui.login.helper.LoginHelper loginHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @LoginScope()
    public final com.example.doctors.ui.login.LoginModel provideLoginModel(@org.jetbrains.annotations.NotNull()
    com.example.doctors.ui.login.helper.LoginHelper loginHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @LoginScope()
    public final com.example.doctors.ui.login.helper.LoginHelper provideLoginHelper(@org.jetbrains.annotations.NotNull()
    com.example.doctors.network.ITokenDownloaderService downloader, @org.jetbrains.annotations.NotNull()
    com.example.doctors.MyApplication application) {
        return null;
    }
    
    public LoginModule() {
        super();
    }
}