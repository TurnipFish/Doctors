package com.example.doctors.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/example/doctors/network/ApiModuleForFetchingContent;", "", "()V", "provideApiServiceForDoctors", "Lcom/example/doctors/network/IContentDownloaderService;", "provideApiServiceForImages", "Lcom/example/doctors/network/IImageDownloaderService;", "provideApiServiceForToken", "Lcom/example/doctors/network/ITokenDownloaderService;", "provideClient", "Lokhttp3/OkHttpClient;", "provideRetrofit", "Lretrofit2/Retrofit;", "baseURL", "", "client", "app_debug"})
@dagger.Module()
public final class ApiModuleForFetchingContent {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient provideClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    java.lang.String baseURL, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    /**
     * creates an Anonymous object of ITokenDownloaderService that performs the "GET" call for token
     * @return - GET request for token service
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.doctors.network.ITokenDownloaderService provideApiServiceForToken() {
        return null;
    }
    
    /**
     * creates an Anonymous object of IContentDownloaderService that performs the "GET" call for
     * Doctors
     * @return - GET request for doctors service
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.doctors.network.IContentDownloaderService provideApiServiceForDoctors() {
        return null;
    }
    
    /**
     * creates an Anonymous object of ITokenDownloaderService that performs the "GET" call for
     * Doctors
     * @return - GET request for image service
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.doctors.network.IImageDownloaderService provideApiServiceForImages() {
        return null;
    }
    
    public ApiModuleForFetchingContent() {
        super();
    }
}