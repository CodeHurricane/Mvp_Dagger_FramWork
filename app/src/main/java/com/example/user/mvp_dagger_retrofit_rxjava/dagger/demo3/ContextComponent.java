package com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo3;

import android.content.Context;

import dagger.Component;

@Component(modules = {ContextModule.class})
public interface ContextComponent {
    Context getContext();
}
