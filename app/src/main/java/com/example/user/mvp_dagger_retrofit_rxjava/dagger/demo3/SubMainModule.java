package com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo3;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class SubMainModule {

    @Provides
    People providesPerson(Context context, String log){
        return new People(context,log);
    }
}
