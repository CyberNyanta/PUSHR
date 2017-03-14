package com.drapoguz.pushr;

import android.app.Application;
import android.content.Context;

import com.drapoguz.pushr.injection.component.AppComponent;
import com.drapoguz.pushr.injection.component.DaggerAppComponent;
import com.drapoguz.pushr.injection.module.AppModule;

public class App extends Application {

    // Data Members
    AppComponent mAppComponent;


    // App Lifecycle
    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();

        mAppComponent.inject(this);
    }


    // Public Methods
    public static App getApp(Context context) {

        return (App) context.getApplicationContext();
    }

    public AppComponent getAppComponent() {

        return mAppComponent;
    }
}
