package com.example.mvp_example01.view.part01;

import android.app.Application;

import com.example.mvp_example01.di.part01.ApplicationComponent;
import com.example.mvp_example01.di.part01.ApplicationModule;
import com.example.mvp_example01.di.part01.DaggerApplicationComponent;
import com.example.mvp_example01.di.part01.LoginModule;

public class App extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
