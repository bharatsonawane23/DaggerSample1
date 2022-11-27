package com.bsitapps.daggersample1.di.module;

import com.bsitapps.daggersample1.data.local.DatabaseService;
import com.bsitapps.daggersample1.data.remote.NetworkService;
import com.bsitapps.daggersample1.ui.MainActivity;
import com.bsitapps.daggersample1.ui.MainViewModel;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    MainActivity mainActivity;

    public ActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Provides
    public MainViewModel providesMainViewModel(DatabaseService databaseService, NetworkService networkService) {
        return new MainViewModel(networkService, databaseService);
    }
}
