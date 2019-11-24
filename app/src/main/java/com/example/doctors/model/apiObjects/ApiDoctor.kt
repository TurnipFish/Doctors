package com.example.doctors.model.apiObjects

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ApiDoctor {
    @SerializedName("id")
    @Expose
    private var id: String? = null

    @SerializedName("name")
    @Expose
    private var name: String? = null

    @SerializedName("address")
    @Expose
    private var address: String? = null

    @SerializedName("photoId")
    @Expose
    private var photoId: String? = null

    fun getId(): String? { return id}
    fun setId(id: String? ){this.id = id}

    fun getName(): String? { return name}
    fun setName(token: String? ){this.name = name}

    fun getAddress(): String? { return address}
    fun setAddress(address: String? ){this.address = address}

    fun getPhotoId(): String? { return photoId}
    fun setPhotoId(photoId: String? ){this.photoId = photoId}
}