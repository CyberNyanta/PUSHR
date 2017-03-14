package com.drapoguz.pushr.injection.component;

import com.drapoguz.pushr.injection.module.ActivityModule;
import com.drapoguz.pushr.injection.scope.PerActivity;
import com.drapoguz.pushr.ui.main.MainActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);
}
