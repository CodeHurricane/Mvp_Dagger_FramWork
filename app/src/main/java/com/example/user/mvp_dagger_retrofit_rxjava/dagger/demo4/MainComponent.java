package com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo4;


import com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo4.MainActivity;

import dagger.Component;

@Component(dependencies = {StringComponent.class,ContextComponent.class},modules = {MainModule.class})
public interface MainComponent {
    void inject(MainActivity mainActivity);

}
