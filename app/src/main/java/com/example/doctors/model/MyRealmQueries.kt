package com.example.doctors.model

import io.realm.Realm
import io.realm.RealmResults
import timber.log.Timber

/**
 *  class for executing realm quereis and mutations
 */
class MyRealmQueries {

    /**
     * Retrieves all search results from Realm
     *
     * @return  RealmResults<Doctor>: List of all doctors
     */
    fun fetchAllDoctors(): RealmResults<Doctor>? {
        val realm : Realm = Realm.getDefaultInstance()
        lateinit var doctors : RealmResults<Doctor>
        try {
            realm.executeTransaction {
                doctors = realm.where(Doctor::class.java).findAll()
            }
        }catch (e: Exception) {
                e.printStackTrace()
                Timber.e("Failed to fetch Doctors from Realm ${e.message}")
         } finally {
            realm.close()
        }

        return doctors
    }

    /**
     * Remove all search results from Realm Doctors object
     *
     */
    fun clearDoctors(): Boolean {
        val realm : Realm = Realm.getDefaultInstance()
        var result = true
        lateinit var doctors : RealmResults<Doctor>
        try {
            realm.executeTransaction {
                realm.where(Doctor::class.java).findAll().deleteAllFromRealm()
            }
        }catch (e: Exception) {
            e.printStackTrace()
            Timber.e("Failed to remove Doctors from Realm ${e.message}")
            result =  false
        } finally {
            realm.close()
        }
        return result

    }
}