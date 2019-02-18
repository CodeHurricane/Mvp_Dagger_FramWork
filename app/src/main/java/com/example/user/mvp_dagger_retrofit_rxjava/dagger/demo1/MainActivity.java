package com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.user.mvp_dagger_retrofit_rxjava.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
   @Inject
   com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo1.People people;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainComponent mainComponent =DaggerMainComponent.builder().mainModule(new MainModule()).build();
        mainComponent.inject(this);
        people.print();

    }
}