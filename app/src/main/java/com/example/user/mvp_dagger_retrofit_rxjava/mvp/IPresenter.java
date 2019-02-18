package com.example.user.mvp_dagger_retrofit_rxjava.mvp;

public interface IPresenter<T>{

    void register(IView view);

    void unRegister();


    T getData();

}
