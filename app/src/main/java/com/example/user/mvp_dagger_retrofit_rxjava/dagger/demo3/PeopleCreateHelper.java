package com.example.user.mvp_dagger_retrofit_rxjava.dagger.demo3;

import android.content.Context;

public class PeopleCreateHelper {

    public static void build(Context context,God god){
        StringComponent stringComponent=DaggerStringComponent.builder().stringModule(new StringModule("abc")).build();
        ContextComponent contextComponent=DaggerContextComponent.builder().contextModule(new ContextModule(context)).build();
        DaggerMainComponent.builder().mainModule(new MainModule()).stringComponent(stringComponent).contextComponent(contextComponent).build().inject(god);
    }

    public static void build(MainActivity mainActivity){
        StringComponent stringComponent=DaggerStringComponent.builder().stringModule(new StringModule("abc")).build();
        ContextComponent contextComponent=DaggerContextComponent.builder().contextModule(new ContextModule(mainActivity)).build();
        DaggerMainComponent.builder().mainModule(new MainModule()).stringComponent(stringComponent).contextComponent(contextComponent).build().inject(mainActivity);
    }
}
