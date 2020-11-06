package com.example.mvp_example01.di.part01;

import android.app.Application;

import com.example.mvp_example01.view.part01.Part01Activity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, LoginModule.class})
public interface ApplicationComponent {
    void inject(Part01Activity target);
}
