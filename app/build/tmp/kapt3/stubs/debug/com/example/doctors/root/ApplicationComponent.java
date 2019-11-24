package com.example.doctors.root;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0011"}, d2 = {"Lcom/example/doctors/root/ApplicationComponent;", "", "application", "Lcom/example/doctors/MyApplication;", "contentDownloaderService", "Lcom/example/doctors/network/IContentDownloaderService;", "imageDownloaderService", "Lcom/example/doctors/network/IImageDownloaderService;", "inject", "", "target", "myRealmQueries", "Lcom/example/doctors/model/MyRealmQueries;", "restApi", "Lcom/example/doctors/network/RestApi;", "tokenDownaloderService", "Lcom/example/doctors/network/ITokenDownloaderService;", "app_debug"})
@dagger.Component(modules = {com.example.doctors.root.ApplicationModule.class, com.example.doctors.network.ApiModuleForFetchingContent.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.doctors.MyApplication target);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.doctors.MyApplication application();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.doctors.network.RestApi restApi();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.doctors.model.MyRealmQueries myRealmQueries();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.doctors.network.IContentDownloaderService contentDownloaderService();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.doctors.network.IImageDownloaderService imageDownloaderService();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.doctors.network.ITokenDownloaderService tokenDownaloderService();
}