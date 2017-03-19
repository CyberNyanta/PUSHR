package com.drapoguz.pushr.ui.main;

import com.drapoguz.pushr.ui.base.BasePresenter;

import javax.inject.Inject;

public class MainPresenter extends BasePresenter<MainContract.View>
        implements MainContract.Presenter<MainContract.View> {

    // Constructors
    @Inject
    public MainPresenter() {

    }


    // Implementation MainContract.Presenter
    @Override
    public void getData() {

    }

    @Override
    public void onMenuProfileClicked() {

        getView().goToProfile();
    }

    @Override
    public void onMenuStatisticsClicked() {

        getView().goToStatistics();
    }

    @Override
    public void onMenuSettingsClicked() {

        getView().goToSettings();
    }

    @Override
    public void onButtonStartTrainingClicked() {

        getView().goToTraining();
    }
}
