package com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.user.mvp_dagger_retrofit_rxjava.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    People people;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PeopleCreateHelper.build(this);
        God god=new God(this);
        god.letPPrint();
        people.print();
    }
}