package com.example.doctors.model;

import java.lang.System;

/**
 * class for executing realm quereis and mutations
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/example/doctors/model/MyRealmQueries;", "", "()V", "clearDoctors", "", "fetchAllDoctors", "Lio/realm/RealmResults;", "Lcom/example/doctors/model/Doctor;", "app_debug"})
public final class MyRealmQueries {
    
    /**
     * Retrieves all search results from Realm
     *
     * @return  RealmResults<Doctor>: List of all doctors
     */
    @org.jetbrains.annotations.Nullable()
    public final io.realm.RealmResults<com.example.doctors.model.Doctor> fetchAllDoctors() {
        return null;
    }
    
    /**
     * Remove all search results from Realm Doctors object
     */
    public final boolean clearDoctors() {
        return false;
    }
    
    public MyRealmQueries() {
        super();
    }
}