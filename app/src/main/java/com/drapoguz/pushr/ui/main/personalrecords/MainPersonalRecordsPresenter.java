package com.drapoguz.pushr.ui.main.personalrecords;

import com.drapoguz.pushr.ui.base.BasePresenter;

import javax.inject.Inject;

public class MainPersonalRecordsPresenter extends BasePresenter<MainPersonalRecordsContract.View>
        implements MainPersonalRecordsContract.Presenter<MainPersonalRecordsContract.View> {

    // Constructors
    @Inject
    public MainPersonalRecordsPresenter() {

    }


    // Implementation MainPersonalRecordsContract.Presenter
    @Override
    public void getData() {

        if (isViewAttached()) {

            getView().setData();
        }
    }

    @Override
    public int getIterationRecord() {

        return 0;
    }

    @Override
    public int getTrainingRecord() {

        return 0;
    }

    @Override
    public int getDayRecord() {

        return 0;
    }
}
