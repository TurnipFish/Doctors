package com.example.doctors.ui.doctors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lcom/example/doctors/ui/doctors/DoctorsModule;", "", "application", "Lcom/example/doctors/MyApplication;", "(Lcom/example/doctors/MyApplication;)V", "getApplication", "()Lcom/example/doctors/MyApplication;", "provideClient", "Lokhttp3/OkHttpClient;", "provideDoctorsHelper", "Lcom/example/doctors/ui/doctors/helper/DoctorsHelper;", "downloader", "Lcom/example/doctors/network/IContentDownloaderService;", "provideDoctorsModel", "Lcom/example/doctors/ui/doctors/DoctorsModel;", "provideDoctorsPresenter", "Lcom/example/doctors/ui/doctors/DoctorsPresenter;", "doctorsModel", "provideDownloader", "Lcom/squareup/picasso/OkHttp3Downloader;", "providePicasso", "Lcom/squareup/picasso/Picasso;", "app_debug"})
@dagger.Module()
public final class DoctorsModule {
    @org.jetbrains.annotations.NotNull()
    private final com.example.doctors.MyApplication application = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @DoctorsScope()
    public final com.example.doctors.ui.doctors.DoctorsPresenter provideDoctorsPresenter(@org.jetbrains.annotations.NotNull()
    com.example.doctors.ui.doctors.DoctorsModel doctorsModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @DoctorsScope()
    public final com.example.doctors.ui.doctors.DoctorsModel provideDoctorsModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @DoctorsScope()
    public final com.example.doctors.ui.doctors.helper.DoctorsHelper provideDoctorsHelper(@org.jetbrains.annotations.NotNull()
    com.example.doctors.MyApplication application, @org.jetbrains.annotations.NotNull()
    com.example.doctors.network.IContentDownloaderService downloader) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @DoctorsScope()
    public final okhttp3.OkHttpClient provideClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @DoctorsScope()
    public final com.squareup.picasso.OkHttp3Downloader provideDownloader() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @DoctorsScope()
    public final com.squareup.picasso.Picasso providePicasso() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.doctors.MyApplication getApplication() {
        return null;
    }
    
    public DoctorsModule(@org.jetbrains.annotations.NotNull()
    com.example.doctors.MyApplication application) {
        super();
    }
}