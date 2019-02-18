package com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo1;

import dagger.Component;

@Component(modules = {MainModule.class})
public interface MainComponent {

    void inject(MainActivity mainActivity);
}
