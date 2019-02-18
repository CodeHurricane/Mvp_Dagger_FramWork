package com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo2;


import android.util.Log;

import javax.inject.Inject;


public class People {
    @Inject
    public People() {
        System.out.println("a people created");
    }
    public  void print(){
        Log.d("sun"," i am people");
    }
}
