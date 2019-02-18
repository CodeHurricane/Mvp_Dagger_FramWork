package com.example.user.mvp_dagger_retrofit_rxjava.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity<T> extends AppCompatActivity implements IView{
    protected BasePresenter<T> iPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
          bindView();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        UnbindView();
    }
    @Override
    public void bindView() {
        iPresenter = createPresenter();
        iPresenter.register(this);

    }

    @Override

    public void UnbindView() {

        iPresenter.unRegister();

    }

    protected abstract BasePresenter createPresenter();

}
