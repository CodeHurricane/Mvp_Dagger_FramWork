package com.example.user.mvp_dagger_retrofit_rxjava.mvp;

import android.util.Log;


import java.lang.ref.WeakReference;

public abstract class BasePresenter<T> implements IPresenter<T> {
    private String TAG=getClass().getSimpleName();

    protected WeakReference iView;
    protected IDataSource<T> iDataSource;

    public BasePresenter() {
        iDataSource=generateDataSource();
    }

    public abstract IDataSource generateDataSource();

    @Override
    public void register(IView view) {

        Log.i(TAG, "BasePresenter register: ");

        iView = new WeakReference(view);

    }

    @Override

    public void unRegister() {
        Log.i(TAG, "BasePresenter unRegister: ");
        iView.clear();
    }

    @Override
    public T getData(){
        return iDataSource.getData();
    }
}