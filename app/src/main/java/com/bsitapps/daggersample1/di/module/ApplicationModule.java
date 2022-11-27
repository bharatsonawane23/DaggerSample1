package com.bsitapps.daggersample1.di.module;

import com.bsitapps.daggersample1.MyApplication;
import com.bsitapps.daggersample1.data.local.DatabaseService;
import com.bsitapps.daggersample1.data.remote.NetworkService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    MyApplication myApplication;

    public ApplicationModule(MyApplication application) {
        this.myApplication = application;
    }

    @Singleton
    @Provides
    NetworkService provideNetworkService() {
        return new NetworkService(myApplication, "apiKey");
    }

    @Singleton
    @Provides
    DatabaseService provideDatabaseService() {
        return new DatabaseService(1, "databaseKey");
    }
}
