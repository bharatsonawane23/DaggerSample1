package com.bsitapps.daggersample1.data.local;

import com.bsitapps.daggersample1.di.qualifier.DatabaseInfo;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DatabaseService {

    public int version;
    public String key;

    @Inject
    public DatabaseService(int version, @DatabaseInfo String key) {
        this.version = version;
        this.key = key;
    }
}
