package com.example.user.mvp_dagger_retrofit_rxjava.mvp.present;

import com.example.user.mvp_dagger_retrofit_rxjava.mvp.BasePresenter;
import com.example.user.mvp_dagger_retrofit_rxjava.mvp.IDataSource;
import com.example.user.mvp_dagger_retrofit_rxjava.mvp.JavaBean.Data;
import com.example.user.mvp_dagger_retrofit_rxjava.mvp.model.DataSourceImpl1;

public class MainPresent extends BasePresenter<Data> {
    @Override
    public IDataSource generateDataSource() {
      return new DataSourceImpl1();
    }
}
