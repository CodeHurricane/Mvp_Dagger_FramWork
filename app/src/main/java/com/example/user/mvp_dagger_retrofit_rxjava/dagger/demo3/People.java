package com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo3;


import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;


public class People{
    Context context;
    String name;
    public People(Context context,String name){
        this.name=name;
        this.context=context;
    }
    public void print(){
        Log.d("sun"," i am people"+name);
        Toast.makeText(context,"i am people"+name,Toast.LENGTH_LONG).show();
    }
}
