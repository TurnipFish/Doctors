package com.example.doctors.ui.doctors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/example/doctors/ui/doctors/DoctorsPresenter;", "Lcom/example/doctors/ui/doctors/DoctorsMVP$Presenter;", "doctorsModel", "Lcom/example/doctors/ui/doctors/DoctorsModel;", "(Lcom/example/doctors/ui/doctors/DoctorsModel;)V", "getDoctorsModel", "()Lcom/example/doctors/ui/doctors/DoctorsModel;", "view", "Lcom/example/doctors/ui/doctors/DoctorsMVP$DoctorsView;", "getView", "()Lcom/example/doctors/ui/doctors/DoctorsMVP$DoctorsView;", "setView", "(Lcom/example/doctors/ui/doctors/DoctorsMVP$DoctorsView;)V", "clearDoctors", "", "deriveSearchOptions", "", "", "searchText", "fetchAllDoctors", "Lio/realm/RealmResults;", "Lcom/example/doctors/model/Doctor;", "setPresenterView", "app_debug"})
public final class DoctorsPresenter implements com.example.doctors.ui.doctors.DoctorsMVP.Presenter {
    @org.jetbrains.annotations.Nullable()
    private com.example.doctors.ui.doctors.DoctorsMVP.DoctorsView view;
    @org.jetbrains.annotations.NotNull()
    private final com.example.doctors.ui.doctors.DoctorsModel doctorsModel = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.doctors.ui.doctors.DoctorsMVP.DoctorsView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    com.example.doctors.ui.doctors.DoctorsMVP.DoctorsView p0) {
    }
    
    @java.lang.Override()
    public void setPresenterView(@org.jetbrains.annotations.NotNull()
    com.example.doctors.ui.doctors.DoctorsMVP.DoctorsView view) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> deriveSearchOptions(@org.jetbrains.annotations.NotNull()
    java.lang.String searchText) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.realm.RealmResults<com.example.doctors.model.Doctor> fetchAllDoctors() {
        return null;
    }
    
    @java.lang.Override()
    public void clearDoctors() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.doctors.ui.doctors.DoctorsModel getDoctorsModel() {
        return null;
    }
    
    public DoctorsPresenter(@org.jetbrains.annotations.NotNull()
    com.example.doctors.ui.doctors.DoctorsModel doctorsModel) {
        super();
    }
}