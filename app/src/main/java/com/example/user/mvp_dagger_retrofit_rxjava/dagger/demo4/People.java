package com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo4;


import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;


public class People {
    @Inject
    String name;
//    @Inject
//    Context context;
    public People(){
       DaggerStringComponent.builder().stringModule(new StringModule("abc")).build().inject(this);
//       DaggerContextComponent.builder().contextModule(new ContextModule()).build().inject(this);
    }
    public void print(){
        Log.d("sun"," i am people"+name);
    }
}
