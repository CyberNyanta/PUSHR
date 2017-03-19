package com.drapoguz.pushr.ui.base;

public interface BaseContract {

    interface View {

        void setData();
    }


    interface Presenter<T> {

        void attachView(T view);

        void detachView();

        boolean isViewAttached();

        T getView();

        void getData();
    }
}
