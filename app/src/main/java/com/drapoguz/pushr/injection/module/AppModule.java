package com.drapoguz.pushr.injection.module;

import android.app.Application;
import android.content.Context;

import com.drapoguz.pushr.injection.qualifier.AppContext;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    // Data Members
    private final Application mApp;


    // Constructors
    public AppModule(Application app) {

        mApp = app;
    }


    // Provide Methods
    @Provides
    Application provideApp() {

        return mApp;
    }

    @Provides
    @AppContext
    Context provideAppContext() {

        return mApp.getApplicationContext();
    }
}
