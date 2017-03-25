package com.drapoguz.pushr.injection.component;

import com.drapoguz.pushr.App;
import com.drapoguz.pushr.injection.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(App app);
}
