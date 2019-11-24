package com.example.doctors.ui.doctors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/example/doctors/ui/doctors/DoctorsModel;", "Lcom/example/doctors/ui/doctors/DoctorsMVP$Model;", "myRealmQueries", "Lcom/example/doctors/model/MyRealmQueries;", "(Lcom/example/doctors/model/MyRealmQueries;)V", "getMyRealmQueries", "()Lcom/example/doctors/model/MyRealmQueries;", "clearDoctors", "", "fetchAllDoctors", "Lio/realm/RealmResults;", "Lcom/example/doctors/model/Doctor;", "app_debug"})
public final class DoctorsModel implements com.example.doctors.ui.doctors.DoctorsMVP.Model {
    @org.jetbrains.annotations.NotNull()
    private final com.example.doctors.model.MyRealmQueries myRealmQueries = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.realm.RealmResults<com.example.doctors.model.Doctor> fetchAllDoctors() {
        return null;
    }
    
    @java.lang.Override()
    public boolean clearDoctors() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.doctors.model.MyRealmQueries getMyRealmQueries() {
        return null;
    }
    
    public DoctorsModel(@org.jetbrains.annotations.NotNull()
    com.example.doctors.model.MyRealmQueries myRealmQueries) {
        super();
    }
}