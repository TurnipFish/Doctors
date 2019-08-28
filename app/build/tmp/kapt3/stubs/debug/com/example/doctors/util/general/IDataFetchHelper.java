package com.example.doctors.util.general;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000e"}, d2 = {"Lcom/example/doctors/util/general/IDataFetchHelper;", "", "checkStatusCode", "", "statusCode", "", "(Ljava/lang/Integer;)Z", "setContext", "", "context", "Landroid/content/Context;", "setView", "view", "Landroid/view/View;", "app_debug"})
public abstract interface IDataFetchHelper {
    
    public abstract void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context context);
    
    public abstract boolean checkStatusCode(@org.jetbrains.annotations.Nullable()
    java.lang.Integer statusCode);
    
    public abstract void setView(@org.jetbrains.annotations.NotNull()
    android.view.View view);
}