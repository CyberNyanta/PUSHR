package com.drapoguz.pushr.injection.component;

import com.drapoguz.pushr.injection.module.ActivityModule;
import com.drapoguz.pushr.injection.scope.ActivityScope;
import com.drapoguz.pushr.ui.main.MainActivity;
import com.drapoguz.pushr.ui.main.personalrecords.MainPersonalRecordsFragment;
import com.drapoguz.pushr.ui.training.TrainingActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

//    void inject(MainActivity mainActivity);

    void inject(MainPersonalRecordsFragment mainPersonalRecordsFragment);

    void inject(TrainingActivity trainingActivity);
}
