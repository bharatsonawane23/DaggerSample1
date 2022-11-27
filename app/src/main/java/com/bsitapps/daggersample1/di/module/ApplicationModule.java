package com.bsitapps.daggersample1.di.module;

import android.content.Context;

import com.bsitapps.daggersample1.MyApplication;
import com.bsitapps.daggersample1.di.qualifier.DatabaseInfo;
import com.bsitapps.daggersample1.di.qualifier.NetworkInfo;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    MyApplication myApplication;

    public ApplicationModule(MyApplication application) {
        this.myApplication = application;
    }

    @Provides
    Context provideContext() {
        return myApplication;
    }

    @DatabaseInfo
    @Provides
    String provideDatabaseName() {
        return "databaseName";
    }

    @NetworkInfo
    @Provides
    String provideApiKey() {
        return "apiKey";
    }

    @Provides
    int provideDatabaseVersion() {
        return 1;
    }

}
