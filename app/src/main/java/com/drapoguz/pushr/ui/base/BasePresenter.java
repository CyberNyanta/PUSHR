package com.drapoguz.pushr.ui.base;

public abstract class BasePresenter<T extends BaseContract.View> implements BaseContract.Presenter<T> {

    // Data Members
    private T mView;


    // Implementation BaseContract.Presenter<T>
    @Override
    public void attachView(T view) {

        mView = view;
    }

    @Override
    public void detachView() {

        mView = null;
    }

    @Override
    public boolean isViewAttached() {

        return mView != null;
    }

    @Override
    public T getView() {

        return mView;
    }
}
