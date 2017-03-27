package com.drapoguz.pushr.injection.module;

import android.content.Context;

import com.drapoguz.pushr.data.source.local.IterationLocalSource;
import com.drapoguz.pushr.data.source.local.IterationLocalSourceContract;
import com.drapoguz.pushr.data.source.local.SettingsLocalSource;
import com.drapoguz.pushr.data.source.local.SettingsLocalSourceContract;
import com.drapoguz.pushr.data.source.local.TrainingLocalSource;
import com.drapoguz.pushr.data.source.local.TrainingLocalSourceContract;
import com.drapoguz.pushr.data.source.local.UserLocalSource;
import com.drapoguz.pushr.data.source.local.UserLocalSourceContract;
import com.drapoguz.pushr.injection.qualifier.AppContext;

import dagger.Module;
import dagger.Provides;

@Module
public class LocalSourceModule {

    // Provide Methods
    @Provides
    public IterationLocalSourceContract provideIterationLocalSource(@AppContext Context context) {

        return new IterationLocalSource(context);
    }
    @Provides
    public SettingsLocalSourceContract provideSettingsLocalSource(@AppContext Context context) {

        return new SettingsLocalSource(context);
    }
    @Provides
    public TrainingLocalSourceContract provideTrainingLocalSource(@AppContext Context context) {

        return new TrainingLocalSource(context);
    }
    @Provides
    public UserLocalSourceContract provideUserLocalSource(@AppContext Context context) {

        return new UserLocalSource(context);
    }
}
