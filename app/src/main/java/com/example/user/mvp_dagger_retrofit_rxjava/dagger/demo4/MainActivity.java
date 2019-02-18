package com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo4;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.user.mvp_dagger_retrofit_rxjava.R;
import com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo3.God;


public class MainActivity extends AppCompatActivity{
    GLSurfaceView glSurfaceView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        glSurfaceView = new GLSurfaceView(this);
        setContentView(glSurfaceView);
//        setContentView(R.layout.activity_main);
//        People people=new People();
//        people.print();
    }
}