package com.example.doctors.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\\\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0006H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/example/doctors/network/IContentDownloaderService;", "", "getContent", "Lio/reactivex/Observable;", "Lcom/example/doctors/model/apiObjects/DoctorsSearch;", "accessToken", "", "lastKey", "latDelta", "", "lngDelta", "location", "search", "sort", "app_debug"})
public abstract interface IContentDownloaderService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "doctors")
    @retrofit2.http.Headers(value = {"Accept: application/json"})
    @retrofit2.http.Streaming()
    public abstract io.reactivex.Observable<com.example.doctors.model.apiObjects.DoctorsSearch> getContent(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String accessToken, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "lastKey")
    java.lang.String lastKey, @retrofit2.http.Query(value = "latDelta")
    double latDelta, @retrofit2.http.Query(value = "lngDelta")
    double lngDelta, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "location")
    java.lang.String location, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "search")
    java.lang.String search, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "sort")
    java.lang.String sort);
}