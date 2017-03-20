package com.drapoguz.pushr.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.drapoguz.pushr.App;
import com.drapoguz.pushr.R;
import com.drapoguz.pushr.ui.base.BaseActivity;
import com.drapoguz.pushr.ui.main.personalrecords.MainPersonalRecordsFragment;
import com.drapoguz.pushr.ui.training.TrainingActivity;
import com.drapoguz.pushr.util.ActivityUtils;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainContract.View {

    // Data
    @Inject
    MainPresenter mPresenter;


    // Activity Lifecycle
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActivityComponent().inject(this);

        setContentView(R.layout.activity_main);

        registerViewElements();

        mPresenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        mPresenter.detachView();
    }


    // Overridden Methods
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_main_profile:
                mPresenter.onMenuProfileClicked();
                return true;
            case R.id.menu_main_statistics:
                mPresenter.onMenuStatisticsClicked();
                return true;
            case R.id.menu_main_settings:
                mPresenter.onMenuSettingsClicked();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


    // UI
    protected void registerViewElements() {

        // Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        toolbar.setTitle(R.string.a_main_title);
        toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.violetDark));
        setSupportActionBar(toolbar);

        // Personal Records Fragment
        MainPersonalRecordsFragment personalRecordsFragment = (MainPersonalRecordsFragment) getSupportFragmentManager()
                .findFragmentById(R.id.frame_personal_records);

        if (personalRecordsFragment == null) {

            personalRecordsFragment = new MainPersonalRecordsFragment();

            ActivityUtils.addFragmentToActivity(
                    getSupportFragmentManager(),
                    personalRecordsFragment,
                    R.id.frame_personal_records);
        }

        // Button Start Training
        Button buttonStartTraining = (Button) findViewById(R.id.button_start_training);
        buttonStartTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mPresenter.onButtonStartTrainingClicked();
            }
        });
    }


    // Implementation MainContract.View
    @Override
    public void setData() {

    }

    @Override
    public void goToProfile() {

    }

    @Override
    public void goToStatistics() {

    }

    @Override
    public void goToSettings() {

    }

    @Override
    public void goToTraining() {

        Intent intent = new Intent(App.getApp(this), TrainingActivity.class);
        startActivity(intent);
    }
}
