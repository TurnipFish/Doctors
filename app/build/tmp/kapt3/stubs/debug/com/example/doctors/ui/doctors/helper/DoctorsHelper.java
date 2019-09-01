package com.example.doctors.ui.doctors.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u001c\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006\""}, d2 = {"Lcom/example/doctors/ui/doctors/helper/DoctorsHelper;", "Lcom/example/doctors/util/general/DataFetchHelper;", "Lcom/example/doctors/ui/doctors/helper/IDoctorsHelper;", "application", "Lcom/example/doctors/MyApplication;", "downloader", "Lcom/example/doctors/network/IContentDownloaderService;", "restApi", "Lcom/example/doctors/network/RestApi;", "mHandler", "Landroid/os/Handler;", "(Lcom/example/doctors/MyApplication;Lcom/example/doctors/network/IContentDownloaderService;Lcom/example/doctors/network/RestApi;Landroid/os/Handler;)V", "getApplication", "()Lcom/example/doctors/MyApplication;", "check", "", "getCheck", "()Z", "setCheck", "(Z)V", "getDownloader", "()Lcom/example/doctors/network/IContentDownloaderService;", "getMHandler", "()Landroid/os/Handler;", "setMHandler", "(Landroid/os/Handler;)V", "getRestApi", "()Lcom/example/doctors/network/RestApi;", "fetchDoctors", "", "search", "", "location", "Runner", "app_debug"})
public final class DoctorsHelper extends com.example.doctors.util.general.DataFetchHelper implements com.example.doctors.ui.doctors.helper.IDoctorsHelper {
    private boolean check;
    @org.jetbrains.annotations.NotNull()
    private final com.example.doctors.MyApplication application = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.doctors.network.IContentDownloaderService downloader = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.doctors.network.RestApi restApi = null;
    @org.jetbrains.annotations.NotNull()
    private android.os.Handler mHandler;
    
    public final boolean getCheck() {
        return false;
    }
    
    public final void setCheck(boolean p0) {
    }
    
    /**
     * calls the API for fetching doctors
     * @param search - Dr. name
     * @param location - The center of the  area to search in
     */
    @java.lang.Override()
    public void fetchDoctors(@org.jetbrains.annotations.Nullable()
    java.lang.String search, @org.jetbrains.annotations.Nullable()
    java.lang.String location) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.doctors.MyApplication getApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.doctors.network.IContentDownloaderService getDownloader() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.doctors.network.RestApi getRestApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Handler getMHandler() {
        return null;
    }
    
    public final void setMHandler(@org.jetbrains.annotations.NotNull()
    android.os.Handler p0) {
    }
    
    public DoctorsHelper(@org.jetbrains.annotations.NotNull()
    com.example.doctors.MyApplication application, @org.jetbrains.annotations.NotNull()
    com.example.doctors.network.IContentDownloaderService downloader, @org.jetbrains.annotations.NotNull()
    com.example.doctors.network.RestApi restApi, @org.jetbrains.annotations.NotNull()
    android.os.Handler mHandler) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/example/doctors/ui/doctors/helper/DoctorsHelper$Runner;", "Ljava/lang/Runnable;", "response", "", "(Lcom/example/doctors/ui/doctors/helper/DoctorsHelper;I)V", "getResponse", "()I", "run", "", "app_debug"})
    public final class Runner implements java.lang.Runnable {
        private final int response = 0;
        
        @java.lang.Override()
        public void run() {
        }
        
        public final int getResponse() {
            return 0;
        }
        
        public Runner(int response) {
            super();
        }
    }
}