package com.drapoguz.pushr.injection.module;

import com.drapoguz.pushr.data.source.local.IterationLocalSourceContract;
import com.drapoguz.pushr.data.source.local.SettingsLocalSourceContract;
import com.drapoguz.pushr.data.source.local.TrainingLocalSourceContract;
import com.drapoguz.pushr.data.source.local.UserLocalSourceContract;
import com.drapoguz.pushr.domain.manager.IterationManager;
import com.drapoguz.pushr.domain.manager.IterationManagerContract;
import com.drapoguz.pushr.domain.manager.SettingsManager;
import com.drapoguz.pushr.domain.manager.SettingsManagerContract;
import com.drapoguz.pushr.domain.manager.TrainingManager;
import com.drapoguz.pushr.domain.manager.TrainingManagerContract;
import com.drapoguz.pushr.domain.manager.UserManager;
import com.drapoguz.pushr.domain.manager.UserManagerContract;

import dagger.Module;
import dagger.Provides;

@Module
public class ManagerModule {

    // Provide Methods
    @Provides
    public IterationManagerContract provideIterationManager(IterationLocalSourceContract iterationLocalSource) {

        return new IterationManager(iterationLocalSource);
    }
    @Provides
    public SettingsManagerContract provideSettingsManager(SettingsLocalSourceContract settingsLocalSource) {

        return new SettingsManager(settingsLocalSource);
    }
    @Provides
    public TrainingManagerContract provideTrainingManager(TrainingLocalSourceContract trainingLocalSource) {

        return new TrainingManager(trainingLocalSource);
    }
    @Provides
    public UserManagerContract provideUserManager(UserLocalSourceContract userLocalSource) {

        return new UserManager(userLocalSource);
    }
}
