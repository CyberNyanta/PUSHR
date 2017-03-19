package com.drapoguz.pushr.ui.base;

import android.support.v7.app.AppCompatActivity;

import com.drapoguz.pushr.App;
import com.drapoguz.pushr.injection.component.ActivityComponent;
import com.drapoguz.pushr.injection.component.DaggerActivityComponent;

public abstract class BaseActivity extends AppCompatActivity {

    // Data Members
    private ActivityComponent mActivityComponent;


    // Protected Methods
    public ActivityComponent getActivityComponent() {

        if (mActivityComponent == null) {

            mActivityComponent = DaggerActivityComponent.builder()
                    .appComponent(App.getApp(this).getAppComponent())
                    .build();
        }

        return mActivityComponent;
    }


    // UI
    protected void registerViewElements() {

    }

    protected void unregisterViewElements() {

    }
}
