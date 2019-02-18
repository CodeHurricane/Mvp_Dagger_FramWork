package com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo4;


import dagger.Component;

@Component(modules = {StringModule.class})
public interface StringComponent {
    String getStrint();
    void inject(People people);
}
