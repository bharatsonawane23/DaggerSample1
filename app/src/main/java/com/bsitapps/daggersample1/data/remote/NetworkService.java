package com.bsitapps.daggersample1.data.remote;

import android.content.Context;

import com.bsitapps.daggersample1.di.qualifier.NetworkInfo;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class NetworkService {

    public Context context;
    public String apiKey;

    @Inject
    public NetworkService(Context context, @NetworkInfo String apiKey) {
        this.context = context;
        this.apiKey = apiKey;
    }
}
