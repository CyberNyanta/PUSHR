package com.drapoguz.pushr.injection.component;

import android.content.Context;

import com.drapoguz.pushr.App;
import com.drapoguz.pushr.injection.module.AppModule;
import com.drapoguz.pushr.injection.qualifier.AppContext;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(App app);

    // downstream components need these exposed with the return type
    // method name does not really matter
    @AppContext Context context();
}
