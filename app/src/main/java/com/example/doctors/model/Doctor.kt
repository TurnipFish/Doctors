package com.example.doctors.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Doctor : RealmObject() {
    @PrimaryKey
    private var id: String = ""
    private var name: String? = null
    private var address: String? = null
    private var photoId: String? = null
    private var imageCache: String? = null

    fun setId(id: String) { this.id = id}
    fun getId(): String { return this.id}

    fun setName(name: String?) { this.name = name}
    fun getName(): String? { return this.name}

    fun setAddress(address: String?) { this.address = address}
    fun getAddress(): String? { return this.address}

    fun setPhotoId(photoId: String?) { this.photoId = photoId}
    fun getPhotoId(): String? { return this.photoId}

    fun setImageCache(imageCache: String?) { this.imageCache = imageCache}
    fun getImageCache(): String? { return this.imageCache}

}
