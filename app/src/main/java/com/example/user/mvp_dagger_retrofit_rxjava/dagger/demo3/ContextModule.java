package com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo3;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {
    Context context;

    public ContextModule(Context context) {
        this.context = context;
    }
    @Provides
    Context getContext(){
        return context;
    }
}
