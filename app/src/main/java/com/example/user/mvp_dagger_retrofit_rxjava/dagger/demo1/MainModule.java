package com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo1;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    @Provides
    People providesPerson() {
        return new People ();
    }
}
