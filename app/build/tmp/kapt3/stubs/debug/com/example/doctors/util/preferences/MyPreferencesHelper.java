package com.example.doctors.util.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/doctors/util/preferences/MyPreferencesHelper;", "", "()V", "LAST_KEY", "", "TOKEN", "getLastKey", "application", "Lcom/example/doctors/MyApplication;", "getPreference", "Landroid/content/SharedPreferences;", "getToken", "setLastKey", "", "key", "setToken", "token", "app_debug"})
public final class MyPreferencesHelper {
    private static final java.lang.String TOKEN = "token";
    private static final java.lang.String LAST_KEY = "last_key";
    public static final com.example.doctors.util.preferences.MyPreferencesHelper INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getPreference(@org.jetbrains.annotations.NotNull()
    com.example.doctors.MyApplication application) {
        return null;
    }
    
    /**
     * UserDetails
     * -----------
     * parameters:  token, last key
     */
    public final void setToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    com.example.doctors.MyApplication application) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken(@org.jetbrains.annotations.NotNull()
    com.example.doctors.MyApplication application) {
        return null;
    }
    
    public final void setLastKey(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    com.example.doctors.MyApplication application) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastKey(@org.jetbrains.annotations.NotNull()
    com.example.doctors.MyApplication application) {
        return null;
    }
    
    private MyPreferencesHelper() {
        super();
    }
}