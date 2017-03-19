package com.drapoguz.pushr.ui.main.personalrecords;

import com.drapoguz.pushr.ui.base.BaseContract;

public interface MainPersonalRecordsContract {

    interface View extends BaseContract.View {

    }

    interface Presenter<T> extends BaseContract.Presenter<T> {

        int getIterationRecord();

        int getTrainingRecord();

        int getDayRecord();
    }
}
