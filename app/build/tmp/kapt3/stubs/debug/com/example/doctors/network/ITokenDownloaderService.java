package com.example.doctors.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lcom/example/doctors/network/ITokenDownloaderService;", "", "getToken", "Lio/reactivex/Observable;", "Lcom/example/doctors/model/apiObjects/Authentication;", "username", "", "password", "app_debug"})
public abstract interface ITokenDownloaderService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "token?grant_type=password")
    @retrofit2.http.Headers(value = {"Content-Type:  application/x-www-form-urlencoded", "Accept: application/json", "Authorization: Basic aXBob25lOmlwaG9uZXdpbGxub3RiZXRoZXJlYW55bW9yZQ=="})
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.Streaming()
    public abstract io.reactivex.Observable<com.example.doctors.model.apiObjects.Authentication> getToken(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password")
    java.lang.String password);
}