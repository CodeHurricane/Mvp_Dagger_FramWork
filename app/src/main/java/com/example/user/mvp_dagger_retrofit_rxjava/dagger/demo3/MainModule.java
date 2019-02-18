package com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo3;

import android.content.Context;

import com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo3.People;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    public MainModule(){
    }
    @Provides
    People providesPerson(Context context,String log){
        return new People(context,log);
    }
}
