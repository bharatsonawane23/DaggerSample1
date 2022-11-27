package com.bsitapps.daggersample1;

import android.app.Application;
import android.util.Log;

import com.bsitapps.daggersample1.data.local.DatabaseService;
import com.bsitapps.daggersample1.data.remote.NetworkService;
import com.bsitapps.daggersample1.di.components.ApplicationComponents;
import com.bsitapps.daggersample1.di.components.DaggerApplicationComponents;
import com.bsitapps.daggersample1.di.module.ApplicationModule;

import javax.inject.Inject;

public class MyApplication extends Application {

    private static final String TAG = MyApplication.class.getSimpleName();
    @Inject
    public NetworkService networkService;
    @Inject
    public DatabaseService databaseService;

    public ApplicationComponents applicationComponents;

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d(TAG, "onCreate: NetworkService" + networkService);
        Log.d(TAG, "onCreate: DatabaseService" + databaseService);

        applicationComponents = DaggerApplicationComponents
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        applicationComponents.inject(this);

        Log.d(TAG, "onCreate: NetworkService" + networkService);
        Log.d(TAG, "onCreate: DatabaseService" + databaseService);
    }
}
