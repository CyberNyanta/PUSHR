package com.drapoguz.pushr.ui.base;

import android.support.v7.app.AppCompatActivity;

import com.drapoguz.pushr.App;
import com.drapoguz.pushr.injection.component.ActivityComponent;
import com.drapoguz.pushr.injection.component.DaggerActivityComponent;
import com.drapoguz.pushr.injection.module.ActivityModule;

public abstract class BaseActivity extends AppCompatActivity {

    // Data Members
    private ActivityComponent mActivityComponent;


    // Protected Methods
    protected ActivityComponent getActivityComponent() {

        if (mActivityComponent == null) {

            mActivityComponent = DaggerActivityComponent.builder()
                    .appComponent(App.getApp(this).getAppComponent())
                    .build();
        }

        return mActivityComponent;
    }
}
