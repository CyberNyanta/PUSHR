package com.drapoguz.pushr.ui.main;

import android.os.Bundle;

import com.drapoguz.pushr.R;
import com.drapoguz.pushr.ui.base.BaseActivity;

public class MainActivity extends BaseActivity implements MainContract.View {

    // Activity Lifecycle
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }
}
