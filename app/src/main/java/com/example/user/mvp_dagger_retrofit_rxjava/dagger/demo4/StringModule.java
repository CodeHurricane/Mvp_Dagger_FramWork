package com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo4;

import dagger.Module;
import dagger.Provides;

@Module
public class StringModule {

    String string;
    public StringModule(String string) {
        this.string = string;
    }
    @Provides
     String getString(){
        return string;
    }
}
