package com.bsitapps.daggersample1.di.components;

import com.bsitapps.daggersample1.MyApplication;
import com.bsitapps.daggersample1.data.local.DatabaseService;
import com.bsitapps.daggersample1.data.remote.NetworkService;
import com.bsitapps.daggersample1.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponents {

    void inject(MyApplication application);

    DatabaseService getDatabaseService();

    NetworkService getNetworkService();
}
