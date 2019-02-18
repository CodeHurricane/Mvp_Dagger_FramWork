package com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo3;


import dagger.Component;

@Component(dependencies = {StringComponent.class,ContextComponent.class},modules = {MainModule.class})
public interface MainComponent {
    void inject(MainActivity mainActivity);
    void inject(God dependencePeople);

}
