package com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo3;

import dagger.Component;

@Component(modules = {StringModule.class})
public interface StringComponent {
    String getStrint();
}
