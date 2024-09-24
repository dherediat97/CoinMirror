package com.nextlevel.coinmirror;

import android.app.Application;
import com.nextlevel.coinmirror.di.AppComponent;
import com.nextlevel.coinmirror.di.DaggerAppComponent;
import dagger.hilt.android.HiltAndroidApp;

@dagger.hilt.android.HiltAndroidApp()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/nextlevel/coinmirror/CoinMirrorApp;", "Landroid/app/Application;", "()V", "appComponent", "Lcom/nextlevel/coinmirror/di/AppComponent;", "getAppComponent", "()Lcom/nextlevel/coinmirror/di/AppComponent;", "appComponent$delegate", "Lkotlin/Lazy;", "app_debug"})
public class CoinMirrorApp extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy appComponent$delegate = null;
    
    public CoinMirrorApp() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nextlevel.coinmirror.di.AppComponent getAppComponent() {
        return null;
    }
}