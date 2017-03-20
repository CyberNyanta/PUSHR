package com.drapoguz.pushr.ui.training;

import android.os.Bundle;

import com.drapoguz.pushr.R;
import com.drapoguz.pushr.ui.base.BaseActivity;

import javax.inject.Inject;

public class TrainingActivity extends BaseActivity implements TrainingContract.View {

    // Data
    @Inject
    TrainingPresenter mTrainingPresenter;


    // Activity Lifecycle
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActivityComponent().inject(this);

        setContentView(R.layout.activity_training);

        initView();

        mTrainingPresenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        mTrainingPresenter.detachView();
    }


    // UI
    private void initView() {

    }


    // Implementation TrainingContract.View
    @Override
    public void setData() {

    }
}
