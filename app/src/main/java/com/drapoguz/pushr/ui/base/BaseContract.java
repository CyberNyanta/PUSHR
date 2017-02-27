package com.drapoguz.pushr.ui.base;

public interface BaseContract {

    interface View {

    }


    interface Presenter<T> {

        void attachView(T view);

        void detachView();

        boolean isViewAttached();

        T getView();
    }
}
