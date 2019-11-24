package com.example.doctors.model.apiObjects

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class Authentication {
    @SerializedName("access_token")
    @Expose
    private var token: String? = null

    @SerializedName("token_type")
    @Expose
    private var tokenType: String? = null

    @SerializedName("refresh_token")
    @Expose
    private var refreshToken: String? = null

    @SerializedName("expires_in")
    @Expose
    private var expiresIn: Long? = null

    @SerializedName("scope")
    @Expose
    private var scope: String? = null

    @SerializedName("jti")
    @Expose
    private var jti: String? = null

    @SerializedName("phoneVerified")
    @Expose
    private var phoneVerified: Boolean? = false

    fun getToken(): String? { return token}
    fun setToken(token: String? ){this.token = token}

    fun getRefreshToken(): String? { return refreshToken}
    fun setRefreshToken(refreshToken: String? ){this.refreshToken = refreshToken}

    fun geTokenType(): String? { return tokenType}
    fun setTokenType(tokenType: String? ){this.tokenType = tokenType}

    fun getScope(): String? { return scope}
    fun setScope(scope: String? ){this.scope = scope}

    fun getExpiresIn(): Long? { return expiresIn}
    fun setExpiresIn(scope: Long? ){this.expiresIn = expiresIn}

    fun getJti(): String? { return jti}
    fun setJti(jti: String? ){this.jti = jti}

    fun getphoneVerified(): Boolean? { return phoneVerified}
    fun setPhoneVerified(phoneVerified: Boolean? ){this.phoneVerified = phoneVerified}
}

