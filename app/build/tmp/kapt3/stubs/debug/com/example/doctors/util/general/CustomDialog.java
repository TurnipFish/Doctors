package com.example.doctors.util.general;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u000e\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&J.\u0010\'\u001a\u00020!2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)J.\u0010.\u001a\u00020!2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)J.\u0010/\u001a\u00020!2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)J\u000e\u0010\u0012\u001a\u00020!2\u0006\u0010\u000e\u001a\u000200J\u000e\u00101\u001a\u00020!2\u0006\u0010%\u001a\u00020&J\u000e\u0010\u0016\u001a\u00020!2\u0006\u0010\u0014\u001a\u000200J\u000e\u0010\u0019\u001a\u00020!2\u0006\u0010\u0014\u001a\u000200J\u000e\u00102\u001a\u00020!2\u0006\u00103\u001a\u000204J\u000e\u00105\u001a\u00020!2\u0006\u0010%\u001a\u00020&J\u000e\u0010\u001c\u001a\u00020!2\u0006\u0010\u0014\u001a\u000200J\u000e\u00106\u001a\u00020!2\u0006\u00103\u001a\u000204J\u000e\u00107\u001a\u00020!2\u0006\u0010%\u001a\u00020&J\u000e\u00108\u001a\u00020!2\u0006\u00103\u001a\u000204J\u000e\u00109\u001a\u00020!2\u0006\u0010%\u001a\u00020&J\u000e\u0010:\u001a\u00020!2\u0006\u00103\u001a\u000204J\u000e\u0010;\u001a\u00020!2\u0006\u00103\u001a\u000204J\u000e\u0010<\u001a\u00020!2\u0006\u0010=\u001a\u000200J\u000e\u0010>\u001a\u00020!2\u0006\u0010?\u001a\u00020&J\u000e\u0010@\u001a\u00020!2\u0006\u0010%\u001a\u00020&R\u0011\u0010\u0005\u001a\u00020\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001e\u0010\u0017\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001e\u0010\u001a\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001e\u0010\u001d\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013\u00a8\u0006A"}, d2 = {"Lcom/example/doctors/util/general/CustomDialog;", "Landroid/app/Dialog;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dialogContext", "getDialogContext", "()Lcom/example/doctors/util/general/CustomDialog;", "dialog_buttons_container", "Landroid/widget/RelativeLayout;", "getDialog_buttons_container", "()Landroid/widget/RelativeLayout;", "setDialog_buttons_container", "(Landroid/widget/RelativeLayout;)V", "header", "Landroid/widget/TextView;", "getHeader", "()Landroid/widget/TextView;", "setHeader", "(Landroid/widget/TextView;)V", "message", "getMessage", "setMessage", "message2", "getMessage2", "setMessage2", "message3", "getMessage3", "setMessage3", "ok", "getOk", "setOk", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setButtonsVisibility", "visibility", "", "setDialogAuthors", "margin", "", "x", "y", "Height", "width", "setDialogIssues", "setDialogLocationCollections", "", "setHeaderVisibility", "setMessage2ClickListener", "listener", "Landroid/view/View$OnClickListener;", "setMessage2Visibility", "setMessage3ClickListener", "setMessage3Visibility", "setMessageClickListener", "setMessageVisibility", "setOkButtonListener", "setOkButtonNewListener", "setOkText", "okTxt", "setOkTextColor", "color", "setOkVisibility", "app_debug"})
public final class CustomDialog extends android.app.Dialog {
    @org.jetbrains.annotations.NotNull()
    private final com.example.doctors.util.general.CustomDialog dialogContext = null;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.example.doctors.R.id.header)
    public android.widget.TextView header;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.example.doctors.R.id.message)
    public android.widget.TextView message;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.example.doctors.R.id.message2)
    public android.widget.TextView message2;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.example.doctors.R.id.message3)
    public android.widget.TextView message3;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.example.doctors.R.id.dialog_buttons_container)
    public android.widget.RelativeLayout dialog_buttons_container;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.example.doctors.R.id.ok)
    public android.widget.TextView ok;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.doctors.util.general.CustomDialog getDialogContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getHeader() {
        return null;
    }
    
    public final void setHeader(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getMessage2() {
        return null;
    }
    
    public final void setMessage2(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getMessage3() {
        return null;
    }
    
    public final void setMessage3(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RelativeLayout getDialog_buttons_container() {
        return null;
    }
    
    public final void setDialog_buttons_container(@org.jetbrains.annotations.NotNull()
    android.widget.RelativeLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getOk() {
        return null;
    }
    
    public final void setOk(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setHeader(@org.jetbrains.annotations.NotNull()
    java.lang.String header) {
    }
    
    public final void setHeaderVisibility(int visibility) {
    }
    
    public final void setMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void setMessage2(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void setMessage3(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void setMessageVisibility(int visibility) {
    }
    
    public final void setMessage2Visibility(int visibility) {
    }
    
    public final void setMessage3Visibility(int visibility) {
    }
    
    public final void setOkText(@org.jetbrains.annotations.NotNull()
    java.lang.String okTxt) {
    }
    
    public final void setOkTextColor(int color) {
    }
    
    public final void setOkVisibility(int visibility) {
    }
    
    public final void setOkButtonNewListener(@org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener listener) {
    }
    
    public final void setButtonsVisibility(int visibility) {
    }
    
    public final void setOkButtonListener(@org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener listener) {
    }
    
    public final void setMessageClickListener(@org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener listener) {
    }
    
    public final void setMessage2ClickListener(@org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener listener) {
    }
    
    public final void setMessage3ClickListener(@org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener listener) {
    }
    
    public final void setDialogIssues(float margin, int x, int y, float Height, float width) {
    }
    
    public final void setDialogAuthors(float margin, int x, int y, float Height, float width) {
    }
    
    public final void setDialogLocationCollections(float margin, int x, int y, float Height, float width) {
    }
    
    public CustomDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super(null);
    }
}