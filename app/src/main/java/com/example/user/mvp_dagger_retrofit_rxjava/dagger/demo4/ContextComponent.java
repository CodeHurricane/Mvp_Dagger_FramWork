package com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo4;

import android.content.Context;

import dagger.Component;

@Component(modules = {ContextModule.class})
public interface ContextComponent {
    Context getContext();
}
