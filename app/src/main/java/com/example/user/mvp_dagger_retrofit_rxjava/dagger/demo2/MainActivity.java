package com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.user.mvp_dagger_retrofit_rxjava.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        People_Factory.create().get().print();
    }
}