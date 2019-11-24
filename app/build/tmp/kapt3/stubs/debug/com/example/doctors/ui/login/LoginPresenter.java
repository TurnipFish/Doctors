package com.example.doctors.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lcom/example/doctors/ui/login/LoginPresenter;", "Lcom/example/doctors/ui/login/LoginMVP$Presenter;", "loginModel", "Lcom/example/doctors/ui/login/LoginModel;", "loginHelper", "Lcom/example/doctors/ui/login/helper/LoginHelper;", "(Lcom/example/doctors/ui/login/LoginModel;Lcom/example/doctors/ui/login/helper/LoginHelper;)V", "getLoginHelper", "()Lcom/example/doctors/ui/login/helper/LoginHelper;", "getLoginModel", "()Lcom/example/doctors/ui/login/LoginModel;", "view", "Lcom/example/doctors/ui/login/LoginMVP$LoginView;", "getView", "()Lcom/example/doctors/ui/login/LoginMVP$LoginView;", "setView", "(Lcom/example/doctors/ui/login/LoginMVP$LoginView;)V", "checkCredentials", "", "userName", "", "password", "login", "", "setPresenterView", "app_debug"})
public final class LoginPresenter implements com.example.doctors.ui.login.LoginMVP.Presenter {
    @org.jetbrains.annotations.Nullable()
    private com.example.doctors.ui.login.LoginMVP.LoginView view;
    @org.jetbrains.annotations.NotNull()
    private final com.example.doctors.ui.login.LoginModel loginModel = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.doctors.ui.login.helper.LoginHelper loginHelper = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.doctors.ui.login.LoginMVP.LoginView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    com.example.doctors.ui.login.LoginMVP.LoginView p0) {
    }
    
    @java.lang.Override()
    public void setPresenterView(@org.jetbrains.annotations.NotNull()
    com.example.doctors.ui.login.LoginMVP.LoginView view) {
    }
    
    @java.lang.Override()
    public boolean checkCredentials(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return false;
    }
    
    @java.lang.Override()
    public void login(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.doctors.ui.login.LoginModel getLoginModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.doctors.ui.login.helper.LoginHelper getLoginHelper() {
        return null;
    }
    
    public LoginPresenter(@org.jetbrains.annotations.NotNull()
    com.example.doctors.ui.login.LoginModel loginModel, @org.jetbrains.annotations.NotNull()
    com.example.doctors.ui.login.helper.LoginHelper loginHelper) {
        super();
    }
}