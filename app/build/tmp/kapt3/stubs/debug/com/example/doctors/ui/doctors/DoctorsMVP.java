package com.example.doctors.ui.doctors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/doctors/ui/doctors/DoctorsMVP;", "", "DoctorsView", "Model", "Presenter", "app_debug"})
public abstract interface DoctorsMVP {
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\u001e\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH&\u00a8\u0006\u0010"}, d2 = {"Lcom/example/doctors/ui/doctors/DoctorsMVP$DoctorsView;", "Lcom/example/doctors/util/general/IView;", "allocateSearchOptions", "", "searchOptions", "", "", "commenceSearchOperation", "initRecyclerView", "resetPage", "setRecyclerView", "viewAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "app_debug"})
    public static abstract interface DoctorsView extends com.example.doctors.util.general.IView {
        
        public abstract void initRecyclerView();
        
        public abstract void setRecyclerView(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> viewAdapter, @org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.LinearLayoutManager viewManager);
        
        public abstract void allocateSearchOptions(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> searchOptions);
        
        public abstract void commenceSearchOperation();
        
        public abstract void resetPage();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000e"}, d2 = {"Lcom/example/doctors/ui/doctors/DoctorsMVP$Presenter;", "", "clearDoctors", "", "deriveSearchOptions", "", "", "searchText", "fetchAllDoctors", "Lio/realm/RealmResults;", "Lcom/example/doctors/model/Doctor;", "setPresenterView", "view", "Lcom/example/doctors/ui/doctors/DoctorsMVP$DoctorsView;", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void setPresenterView(@org.jetbrains.annotations.NotNull()
        com.example.doctors.ui.doctors.DoctorsMVP.DoctorsView view);
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<java.lang.String> deriveSearchOptions(@org.jetbrains.annotations.NotNull()
        java.lang.String searchText);
        
        @org.jetbrains.annotations.Nullable()
        public abstract io.realm.RealmResults<com.example.doctors.model.Doctor> fetchAllDoctors();
        
        public abstract void clearDoctors();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/doctors/ui/doctors/DoctorsMVP$Model;", "", "clearDoctors", "", "fetchAllDoctors", "Lio/realm/RealmResults;", "Lcom/example/doctors/model/Doctor;", "app_debug"})
    public static abstract interface Model {
        
        @org.jetbrains.annotations.Nullable()
        public abstract io.realm.RealmResults<com.example.doctors.model.Doctor> fetchAllDoctors();
        
        public abstract boolean clearDoctors();
    }
}