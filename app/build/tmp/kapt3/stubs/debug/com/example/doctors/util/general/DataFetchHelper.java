package com.example.doctors.util.general;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\nH\u0016J\u0016\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cJ/\u0010\u001e\u001a\u00020\u0015\"\n\b\u0000\u0010\u001f\u0018\u0001*\u00020\u0017\"\n\b\u0001\u0010 \u0018\u0001*\u00020\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H 0\"H\u0086\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006#"}, d2 = {"Lcom/example/doctors/util/general/DataFetchHelper;", "Lcom/example/doctors/util/general/IDataFetchHelper;", "()V", "ctx", "Landroidx/fragment/app/FragmentActivity;", "getCtx", "()Landroidx/fragment/app/FragmentActivity;", "setCtx", "(Landroidx/fragment/app/FragmentActivity;)V", "mView", "Landroid/view/View;", "getMView", "()Landroid/view/View;", "setMView", "(Landroid/view/View;)V", "checkStatusCode", "", "statusCode", "", "(Ljava/lang/Integer;)Z", "setContext", "", "context", "Landroid/content/Context;", "setView", "view", "showDialog", "header", "", "msg", "startNewActivity", "T", "R", "clazz", "Ljava/lang/Class;", "app_debug"})
public class DataFetchHelper implements com.example.doctors.util.general.IDataFetchHelper {
    @org.jetbrains.annotations.Nullable()
    private androidx.fragment.app.FragmentActivity ctx;
    @org.jetbrains.annotations.Nullable()
    private android.view.View mView;
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.fragment.app.FragmentActivity getCtx() {
        return null;
    }
    
    public final void setCtx(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.FragmentActivity p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View getMView() {
        return null;
    }
    
    public final void setMView(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    @java.lang.Override()
    public void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void setView(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public boolean checkStatusCode(@org.jetbrains.annotations.Nullable()
    java.lang.Integer statusCode) {
        return false;
    }
    
    public final void showDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String header, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public DataFetchHelper() {
        super();
    }
}