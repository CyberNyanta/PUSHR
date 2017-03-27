package com.drapoguz.pushr.ui.main;

import com.drapoguz.pushr.domain.manager.IterationManagerContract;
import com.drapoguz.pushr.injection.component.DaggerLocalSourceComponent;
import com.drapoguz.pushr.injection.component.DaggerManagerComponent;
import com.drapoguz.pushr.injection.module.LocalSourceModule;
import com.drapoguz.pushr.injection.module.ManagerModule;
import com.drapoguz.pushr.ui.base.BasePresenter;

import javax.inject.Inject;

public class MainPresenter extends BasePresenter<MainContract.View>
        implements MainContract.Presenter<MainContract.View> {

    @Inject
    IterationManagerContract IterationManager;


    // Constructors
    public MainPresenter() {
        DaggerLocalSourceComponent.builder()
                .localSourceModule(new LocalSourceModule())
                .build();
        DaggerManagerComponent.builder()
                .managerModule(new ManagerModule())
                .build();


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
