package com.example.doctors.model.apiObjects;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\b\u0010\t\u001a\u0004\u0018\u00010\u0007J\u0016\u0010\n\u001a\u00020\u000b2\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\u0010\u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u001a\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/doctors/model/apiObjects/DoctorsSearch;", "", "()V", "apiDoctors", "", "Lcom/example/doctors/model/apiObjects/ApiDoctor;", "lastKey", "", "getDoctors", "getLastKey", "setDoctors", "", "setLastKey", "app_debug"})
public final class DoctorsSearch {
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "doctors")
    private java.util.List<com.example.doctors.model.apiObjects.ApiDoctor> apiDoctors;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "lastKey")
    private java.lang.String lastKey;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.doctors.model.apiObjects.ApiDoctor> getDoctors() {
        return null;
    }
    
    public final void setDoctors(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.doctors.model.apiObjects.ApiDoctor> apiDoctors) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastKey() {
        return null;
    }
    
    public final void setLastKey(@org.jetbrains.annotations.Nullable()
    java.lang.String lastKey) {
    }
    
    public DoctorsSearch() {
        super();
    }
}