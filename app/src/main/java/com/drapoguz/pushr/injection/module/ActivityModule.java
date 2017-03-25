package com.drapoguz.pushr.injection.module;

import android.app.Activity;
import android.content.Context;

import com.drapoguz.pushr.injection.qualifier.ActivityContext;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    // Data Members
    private Activity mActivity;


    // Constructors
    public ActivityModule(Activity activity) {

        mActivity = activity;
    }


    // Provide Methods
    @Provides
    public Activity provideActivity() {

        return mActivity;
    }

    @Provides
    @ActivityContext
    public Context provideActivityContext() {

        return mActivity;
    }
}
