package com.drapoguz.pushr.injection.component;

import com.drapoguz.pushr.data.source.local.IterationLocalSourceContract;
import com.drapoguz.pushr.data.source.local.SettingsLocalSourceContract;
import com.drapoguz.pushr.data.source.local.TrainingLocalSourceContract;
import com.drapoguz.pushr.data.source.local.UserLocalSourceContract;
import com.drapoguz.pushr.injection.module.LocalSourceModule;
import com.drapoguz.pushr.injection.scope.LocalSourceScope;
import com.drapoguz.pushr.ui.main.MainPresenter;

import dagger.Component;

@LocalSourceScope
@Component(dependencies = AppComponent.class, modules = LocalSourceModule.class)
public interface LocalSourceComponent {

    // downstream components need these exposed with the return type
    // method name does not really matter
    IterationLocalSourceContract iterationLocalSource();
    SettingsLocalSourceContract settingsLocalSource();
    TrainingLocalSourceContract trainingLocalSource();
    UserLocalSourceContract userLocalSource();

}
