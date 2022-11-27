package com.bsitapps.daggersample1.di.components;

import com.bsitapps.daggersample1.di.module.ActivityModule;
import com.bsitapps.daggersample1.di.scope.ActivityScope;
import com.bsitapps.daggersample1.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@ActivityScope
@Component(dependencies = {ApplicationComponents.class}, modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(MainActivity mainActivity);
}
