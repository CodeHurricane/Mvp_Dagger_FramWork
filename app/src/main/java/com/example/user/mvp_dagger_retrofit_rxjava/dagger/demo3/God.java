package com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo3;

import android.content.Context;

import javax.inject.Inject;

public class God {
    @Inject
    People people;

    public God(Context context){
        PeopleCreateHelper.build(context,this);
    }
    public void letPPrint(){
          people.print();
    }
}
