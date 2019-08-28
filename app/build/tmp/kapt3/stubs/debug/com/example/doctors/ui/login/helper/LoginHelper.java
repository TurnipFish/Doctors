package com.example.doctors.ui.login.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0015"}, d2 = {"Lcom/example/doctors/ui/login/helper/LoginHelper;", "Lcom/example/doctors/util/general/DataFetchHelper;", "Lcom/example/doctors/ui/login/helper/ILoginHelper;", "downloader", "Lcom/example/doctors/network/ITokenDownloaderService;", "application", "Lcom/example/doctors/MyApplication;", "(Lcom/example/doctors/network/ITokenDownloaderService;Lcom/example/doctors/MyApplication;)V", "getApplication", "()Lcom/example/doctors/MyApplication;", "getDownloader", "()Lcom/example/doctors/network/ITokenDownloaderService;", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "login", "", "email", "", "password", "app_debug"})
public final class LoginHelper extends com.example.doctors.util.general.DataFetchHelper implements com.example.doctors.ui.login.helper.ILoginHelper {
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler mHandler = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.doctors.network.ITokenDownloaderService downloader = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.doctors.MyApplication application = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Handler getMHandler() {
        return null;
    }
    
    @java.lang.Override()
    public void login(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.doctors.network.ITokenDownloaderService getDownloader() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.doctors.MyApplication getApplication() {
        return null;
    }
    
    public LoginHelper(@org.jetbrains.annotations.NotNull()
    com.example.doctors.network.ITokenDownloaderService downloader, @org.jetbrains.annotations.NotNull()
    com.example.doctors.MyApplication application) {
        super();
    }
}