package com.example.doctors.util.data

class MyContentDataSource {
    companion object factory{
        val BASE_URL_TOKEN = "https://auth.staging.vivy.com/oauth/"
        val BASE_URL_DOCTORS = "https://api.staging.vivy.com/api/users/me/"
        val BASE_URL_DOCTORS_IMAGES = "https://api.staging.vivy.com/api/doctors/"
        val BASE_URL_DOCTORS_IMAGES2 = "/keys/profilepictures"

        //Authentication
        val USER_AUTH = "Basic aXBob25lOmlwaG9uZXdpbGxub3RiZXRoZXJlYW55bW9yZQ=="
        val USER_NAME = "androidChallenge@vivy.com"
        val USER_PASSWORD = "88888888"
        val FREE_TEXT = "Stephan"
        val LOCATION = "Mitte, Berlin"

        //Network responses
        val NETWORK_STATUS_OK: Int = 201
        val NETWORK_STATUS_ERROR: Int = 401

        //search constants
        val LAT_DELTA = 0.0122858883093357
        val LNG_DELTA = 0.0151786495888473

        //Geometry
        val TEASER_WIDTH_TO_HEIGHT_RATIO = 1.7

        //Length Limits
        val MAX_ADDRESS_LENGTH = 40
    }


}