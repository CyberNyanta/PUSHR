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
import com.drapoguz.pushr.ui.training.TrainingActivity;

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
                mMainPresenter.onMenuProfileClicked();
                return true;
            case R.id.menu_main_statistics:
                mMainPresenter.onMenuStatisticsClicked();
                return true;
            case R.id.menu_main_settings:
                mMainPresenter.onMenuSettingsClicked();
                return true;
        }

        return super.onOptionsItemSelected(item);
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
