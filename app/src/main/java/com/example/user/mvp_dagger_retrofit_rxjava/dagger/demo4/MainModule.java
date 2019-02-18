package com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo4;

import android.content.Context;

import com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo4.People;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    public MainModule() {
    }
    @Provides
    People providesPerson(){
        return new People();
    }
}
