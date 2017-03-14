package com.drapoguz.pushr.ui.main;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.drapoguz.pushr.R;
import com.drapoguz.pushr.ui.base.BaseActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainContract.View {

    // Data Members
    @Inject
    MainPresenter mMainPresenter;


    // Activity Lifecycle
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActivityComponent().inject(this);

        setContentView(R.layout.activity_main);

        initView();

        mMainPresenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        mMainPresenter.detachView();
    }


    // UI
    private void initView() {

        // Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        toolbar.setTitle(R.string.a_main_title);
        toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.violetDark));
        setSupportActionBar(toolbar);

        // Button Start Training
        Button buttonStartTraining = (Button) findViewById(R.id.button_start_training);
        buttonStartTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mMainPresenter.onButtonStartTrainingClicked();
            }
        });
    }


    // Implementation MainContract.View
    @Override
    public void goToTraining() {

    }
}
