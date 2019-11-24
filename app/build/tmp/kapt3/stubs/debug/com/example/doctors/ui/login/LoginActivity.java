package com.example.doctors.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\u0012\u0010\"\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\b\u0010%\u001a\u00020 H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\t\u00a8\u0006&"}, d2 = {"Lcom/example/doctors/ui/login/LoginActivity;", "Lcom/example/doctors/ui/login/LoginDagger;", "Lcom/example/doctors/ui/login/LoginMVP$LoginView;", "()V", "email", "Landroidx/appcompat/widget/AppCompatEditText;", "getEmail", "()Landroidx/appcompat/widget/AppCompatEditText;", "setEmail", "(Landroidx/appcompat/widget/AppCompatEditText;)V", "header", "Landroid/widget/TextView;", "getHeader", "()Landroid/widget/TextView;", "setHeader", "(Landroid/widget/TextView;)V", "login", "Landroid/widget/Button;", "getLogin", "()Landroid/widget/Button;", "setLogin", "(Landroid/widget/Button;)V", "loginPresenter", "Lcom/example/doctors/ui/login/LoginPresenter;", "getLoginPresenter", "()Lcom/example/doctors/ui/login/LoginPresenter;", "setLoginPresenter", "(Lcom/example/doctors/ui/login/LoginPresenter;)V", "password", "getPassword", "setPassword", "initActionBar", "", "initListeners", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onInject", "app_debug"})
public final class LoginActivity extends com.example.doctors.ui.login.LoginDagger implements com.example.doctors.ui.login.LoginMVP.LoginView {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.example.doctors.R.id.header)
    public android.widget.TextView header;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.example.doctors.R.id.login)
    public android.widget.Button login;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.example.doctors.R.id.email)
    public androidx.appcompat.widget.AppCompatEditText email;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.example.doctors.R.id.password)
    public androidx.appcompat.widget.AppCompatEditText password;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.doctors.ui.login.LoginPresenter loginPresenter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getHeader() {
        return null;
    }
    
    public final void setHeader(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getLogin() {
        return null;
    }
    
    public final void setLogin(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.AppCompatEditText getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.AppCompatEditText getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatEditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.doctors.ui.login.LoginPresenter getLoginPresenter() {
        return null;
    }
    
    public final void setLoginPresenter(@org.jetbrains.annotations.NotNull()
    com.example.doctors.ui.login.LoginPresenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onInject() {
    }
    
    /**
     * sets the action bar header
     */
    @java.lang.Override()
    public void initActionBar() {
    }
    
    /**
     * sets listeners for views in the Activity
     */
    @java.lang.Override()
    public void initListeners() {
    }
    
    public LoginActivity() {
        super();
    }
}