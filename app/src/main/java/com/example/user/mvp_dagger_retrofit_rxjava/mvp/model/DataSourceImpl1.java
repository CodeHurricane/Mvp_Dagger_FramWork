package com.example.user.mvp_dagger_retrofit_rxjava.mvp.model;

import com.example.user.mvp_dagger_retrofit_rxjava.mvp.IDataSource;
import com.example.user.mvp_dagger_retrofit_rxjava.mvp.JavaBean.Data;

public class DataSourceImpl1 implements IDataSource<Data>{
    @Override
    public Data getData() {
        return new Data("abc");
    }
}
