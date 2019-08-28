package com.example.doctors.model.apiObjects;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007J\r\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007J\r\u0010\u0016\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00192\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00192\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0015\u0010\u001c\u001a\u00020\u00192\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00192\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u001f\u001a\u00020\u00192\b\u0010\f\u001a\u0004\u0018\u00010\u0007J\u0010\u0010 \u001a\u00020\u00192\b\u0010\r\u001a\u0004\u0018\u00010\u0007J\u0010\u0010!\u001a\u00020\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/example/doctors/model/apiObjects/Authentication;", "", "()V", "expiresIn", "", "Ljava/lang/Long;", "jti", "", "phoneVerified", "", "Ljava/lang/Boolean;", "refreshToken", "scope", "token", "tokenType", "geTokenType", "getExpiresIn", "()Ljava/lang/Long;", "getJti", "getRefreshToken", "getScope", "getToken", "getphoneVerified", "()Ljava/lang/Boolean;", "setExpiresIn", "", "(Ljava/lang/Long;)V", "setJti", "setPhoneVerified", "(Ljava/lang/Boolean;)V", "setRefreshToken", "setScope", "setToken", "setTokenType", "app_debug"})
public final class Authentication {
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "access_token")
    private java.lang.String token;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "token_type")
    private java.lang.String tokenType;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "refresh_token")
    private java.lang.String refreshToken;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "expires_in")
    private java.lang.Long expiresIn;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "scope")
    private java.lang.String scope;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "jti")
    private java.lang.String jti;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "phoneVerified")
    private java.lang.Boolean phoneVerified;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.Nullable()
    java.lang.String token) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRefreshToken() {
        return null;
    }
    
    public final void setRefreshToken(@org.jetbrains.annotations.Nullable()
    java.lang.String refreshToken) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String geTokenType() {
        return null;
    }
    
    public final void setTokenType(@org.jetbrains.annotations.Nullable()
    java.lang.String tokenType) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getScope() {
        return null;
    }
    
    public final void setScope(@org.jetbrains.annotations.Nullable()
    java.lang.String scope) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getExpiresIn() {
        return null;
    }
    
    public final void setExpiresIn(@org.jetbrains.annotations.Nullable()
    java.lang.Long scope) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getJti() {
        return null;
    }
    
    public final void setJti(@org.jetbrains.annotations.Nullable()
    java.lang.String jti) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getphoneVerified() {
        return null;
    }
    
    public final void setPhoneVerified(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean phoneVerified) {
    }
    
    public Authentication() {
        super();
    }
}