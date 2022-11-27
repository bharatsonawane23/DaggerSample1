package com.bsitapps.daggersample1.ui;

import androidx.lifecycle.ViewModel;

import com.bsitapps.daggersample1.data.local.DatabaseService;
import com.bsitapps.daggersample1.data.remote.NetworkService;

public class MainViewModel extends ViewModel {

    public DatabaseService databaseService;
    public NetworkService networkService;

    public MainViewModel(NetworkService networkService, DatabaseService databaseService) {
        this.databaseService = databaseService;
        this.networkService = networkService;
    }

    String getSampleData() {
        return "Hello Dagger2";
    }
}
