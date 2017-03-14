package com.drapoguz.pushr.ui.main;

import com.drapoguz.pushr.ui.base.BaseContract;

interface MainContract {

    interface View extends BaseContract.View {

        void goToTraining();
    }


    interface Presenter<T> extends BaseContract.Presenter<T> {

        void onButtonStartTrainingClicked();
    }
}
