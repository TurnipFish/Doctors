package com.example.doctors.util.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/doctors/util/data/MyContentDataSource;", "", "()V", "factory", "app_debug"})
public final class MyContentDataSource {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BASE_URL_TOKEN = "https://auth.staging.vivy.com/oauth/";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BASE_URL_DOCTORS = "https://api.staging.vivy.com/api/users/me/";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BASE_URL_DOCTORS_IMAGES = "https://api.staging.vivy.com/api/doctors/";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BASE_URL_DOCTORS_IMAGES2 = "/keys/profilepictures";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String USER_AUTH = "Basic aXBob25lOmlwaG9uZXdpbGxub3RiZXRoZXJlYW55bW9yZQ==";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String USER_NAME = "androidChallenge@vivy.com";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String USER_PASSWORD = "88888888";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String FREE_TEXT = "Stephan";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String LOCATION = "Mitte, Berlin";
    private static final int NETWORK_STATUS_OK = 201;
    private static final int NETWORK_STATUS_ERROR = 401;
    private static final double LAT_DELTA = 0.0122858883093357;
    private static final double LNG_DELTA = 0.0151786495888473;
    private static final double TEASER_WIDTH_TO_HEIGHT_RATIO = 1.7;
    private static final int MAX_ADDRESS_LENGTH = 40;
    public static final com.example.doctors.util.data.MyContentDataSource.factory factory = null;
    
    public MyContentDataSource() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0010X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0010X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0018X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u0018X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u0018X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u0010X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012R\u0014\u0010!\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0006\u00a8\u0006\'"}, d2 = {"Lcom/example/doctors/util/data/MyContentDataSource$factory;", "", "()V", "BASE_URL_DOCTORS", "", "getBASE_URL_DOCTORS", "()Ljava/lang/String;", "BASE_URL_DOCTORS_IMAGES", "getBASE_URL_DOCTORS_IMAGES", "BASE_URL_DOCTORS_IMAGES2", "getBASE_URL_DOCTORS_IMAGES2", "BASE_URL_TOKEN", "getBASE_URL_TOKEN", "FREE_TEXT", "getFREE_TEXT", "LAT_DELTA", "", "getLAT_DELTA", "()D", "LNG_DELTA", "getLNG_DELTA", "LOCATION", "getLOCATION", "MAX_ADDRESS_LENGTH", "", "getMAX_ADDRESS_LENGTH", "()I", "NETWORK_STATUS_ERROR", "getNETWORK_STATUS_ERROR", "NETWORK_STATUS_OK", "getNETWORK_STATUS_OK", "TEASER_WIDTH_TO_HEIGHT_RATIO", "getTEASER_WIDTH_TO_HEIGHT_RATIO", "USER_AUTH", "getUSER_AUTH", "USER_NAME", "getUSER_NAME", "USER_PASSWORD", "getUSER_PASSWORD", "app_debug"})
    public static final class factory {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBASE_URL_TOKEN() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBASE_URL_DOCTORS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBASE_URL_DOCTORS_IMAGES() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBASE_URL_DOCTORS_IMAGES2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUSER_AUTH() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUSER_NAME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUSER_PASSWORD() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFREE_TEXT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLOCATION() {
            return null;
        }
        
        public final int getNETWORK_STATUS_OK() {
            return 0;
        }
        
        public final int getNETWORK_STATUS_ERROR() {
            return 0;
        }
        
        public final double getLAT_DELTA() {
            return 0.0;
        }
        
        public final double getLNG_DELTA() {
            return 0.0;
        }
        
        public final double getTEASER_WIDTH_TO_HEIGHT_RATIO() {
            return 0.0;
        }
        
        public final int getMAX_ADDRESS_LENGTH() {
            return 0;
        }
        
        private factory() {
            super();
        }
    }
}