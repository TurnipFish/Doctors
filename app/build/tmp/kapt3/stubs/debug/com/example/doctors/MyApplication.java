package com.example.doctors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u0018\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010!\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\nH\u0016J\b\u0010\"\u001a\u00020\u0010H\u0016R\u0013\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006#"}, d2 = {"Lcom/example/doctors/MyApplication;", "Landroidx/multidex/MultiDexApplication;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "component", "error/NonExistentClass", "getComponent", "()Lerror/NonExistentClass;", "Lerror/NonExistentClass;", "mCurrentActivity", "Landroid/app/Activity;", "myVersioning", "Lcom/example/doctors/util/data/MyVersioningHelper;", "getMyVersioning", "()Lcom/example/doctors/util/data/MyVersioningHelper;", "attachBaseContext", "", "base", "Landroid/content/Context;", "getApplicationComponent", "Lcom/example/doctors/root/ApplicationComponent;", "isOnline", "", "onActivityCreated", "activity", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "onCreate", "app_debug"})
public final class MyApplication extends androidx.multidex.MultiDexApplication implements android.app.Application.ActivityLifecycleCallbacks {
    private android.app.Activity mCurrentActivity;
    @org.jetbrains.annotations.NotNull()
    private final com.example.doctors.util.data.MyVersioningHelper myVersioning = null;
    @org.jetbrains.annotations.NotNull()
    private final error.NonExistentClass component = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.doctors.util.data.MyVersioningHelper getMyVersioning() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final error.NonExistentClass getComponent() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.doctors.root.ApplicationComponent getApplicationComponent() {
        return null;
    }
    
    /**
     * Enabling multidex support
     * https://developer.android.com/tools/building/multidex.html
     *
     * @param  base context
     */
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context base) {
    }
    
    /**
     * Checks if user has internet connectivity
     *
     * @return true if device is internet-connected
     */
    public final boolean isOnline() {
        return false;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityStarted(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityResumed(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityPaused(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityStopped(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivitySaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onActivityDestroyed(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public MyApplication() {
        super();
    }
}