package com.example.doctors.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018J.\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!J2\u0010#\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010!2\b\u0010&\u001a\u0004\u0018\u00010!J$\u0010\'\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)J\u0016\u0010+\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\nJ$\u0010-\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150)R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b\u00a8\u0006."}, d2 = {"Lcom/example/doctors/network/RestApi;", "", "()V", "dataFetchSuccess", "", "getDataFetchSuccess", "()Z", "setDataFetchSuccess", "(Z)V", "recordsCounter", "", "getRecordsCounter", "()I", "setRecordsCounter", "(I)V", "success", "getSuccess", "setSuccess", "addDoctorToRealm", "", "apiDoctor", "Lcom/example/doctors/model/apiObjects/ApiDoctor;", "addToRealmDoctor", "dbDoctor", "Lcom/example/doctors/model/Doctor;", "generateObservableStreamForAuthentication", "application", "Lcom/example/doctors/MyApplication;", "mHandler", "Landroid/os/Handler;", "iService", "Lcom/example/doctors/network/ITokenDownloaderService;", "email", "", "password", "generateObservableStreamForDoctors", "Lcom/example/doctors/network/IContentDownloaderService;", "search", "location", "observableStreamerSubscriber", "observable", "Lio/reactivex/Observable;", "Lcom/example/doctors/model/apiObjects/Authentication;", "sendMessage", "statusCode", "subscriberToDoctorsObservable", "app_debug"})
public final class RestApi {
    private static boolean success;
    private static int recordsCounter;
    private static boolean dataFetchSuccess;
    public static final com.example.doctors.network.RestApi INSTANCE = null;
    
    public final boolean getSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    public final int getRecordsCounter() {
        return 0;
    }
    
    public final void setRecordsCounter(int p0) {
    }
    
    public final boolean getDataFetchSuccess() {
        return false;
    }
    
    public final void setDataFetchSuccess(boolean p0) {
    }
    
    /**
     * Create a single Observable streamer for authentication
     *
     * @param View context
     * @param iService the applied API service
     * @param mHandler - Hanlder to caller
     * @param email - user email
     * @param password - user password
     */
    public final void generateObservableStreamForAuthentication(@org.jetbrains.annotations.NotNull()
    com.example.doctors.MyApplication application, @org.jetbrains.annotations.NotNull()
    android.os.Handler mHandler, @org.jetbrains.annotations.NotNull()
    com.example.doctors.network.ITokenDownloaderService iService, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void observableStreamerSubscriber(@org.jetbrains.annotations.NotNull()
    com.example.doctors.MyApplication application, @org.jetbrains.annotations.NotNull()
    android.os.Handler mHandler, @org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<com.example.doctors.model.apiObjects.Authentication> observable) {
    }
    
    /**
     * Create a single Observable streamer for authentication
     *
     * @param  View context
     * @param iService the applied API service
     * @param mHandler - Hanlder to caller
     * @param search - ApiDoctor name
     * @param location - location at the center of a circle in which search is  conducted
     */
    public final void generateObservableStreamForDoctors(@org.jetbrains.annotations.NotNull()
    com.example.doctors.MyApplication application, @org.jetbrains.annotations.NotNull()
    android.os.Handler mHandler, @org.jetbrains.annotations.NotNull()
    com.example.doctors.network.IContentDownloaderService iService, @org.jetbrains.annotations.Nullable()
    java.lang.String search, @org.jetbrains.annotations.Nullable()
    java.lang.String location) {
    }
    
    /**
     * Subscriber to the Doctors observable
     * @param application
     * @param mHandler - Handler to the caller
     * @Param observable - emitter of ApiDoctor objects
     */
    public final void subscriberToDoctorsObservable(@org.jetbrains.annotations.NotNull()
    com.example.doctors.MyApplication application, @org.jetbrains.annotations.NotNull()
    android.os.Handler mHandler, @org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<com.example.doctors.model.apiObjects.ApiDoctor> observable) {
    }
    
    /**
     * transmit a message to an Handler in the MainThread waiting for a task executed on
     * a working thread to finish
     *
     * @param mHandler The Handler which belongs to the MainThread
     * @param statusCode The message content success/failure
     */
    public final void sendMessage(@org.jetbrains.annotations.NotNull()
    android.os.Handler mHandler, int statusCode) {
    }
    
    /**
     * add a doctor object to Realm
     *
     * @param apiDoctor An doctor object
     */
    public final void addDoctorToRealm(@org.jetbrains.annotations.NotNull()
    com.example.doctors.model.apiObjects.ApiDoctor apiDoctor) {
    }
    
    /**
     * copy doctor details to a doctor  Realm object
     *
     * @param apiDoctor An doctor object
     * @param dbDoctor a realm doctor object
     */
    public final void addToRealmDoctor(@org.jetbrains.annotations.NotNull()
    com.example.doctors.model.apiObjects.ApiDoctor apiDoctor, @org.jetbrains.annotations.NotNull()
    com.example.doctors.model.Doctor dbDoctor) {
    }
    
    private RestApi() {
        super();
    }
}