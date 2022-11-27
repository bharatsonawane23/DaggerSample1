package com.bsitapps.daggersample1.di.module;

import android.content.Context;

import com.bsitapps.daggersample1.ui.MainActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    MainActivity mainActivity;

    public ActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Provides
    Context provideContext() {
        return mainActivity;
    }
}
