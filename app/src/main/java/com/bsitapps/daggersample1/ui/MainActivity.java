package com.bsitapps.daggersample1.ui;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bsitapps.daggersample1.MyApplication;
import com.bsitapps.daggersample1.R;
import com.bsitapps.daggersample1.di.components.DaggerActivityComponent;
import com.bsitapps.daggersample1.di.module.ActivityModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    @Inject
    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: MainViewModel " + mainViewModel);
        DaggerActivityComponent
                .builder()
                .activityModule(new ActivityModule(this))
                .applicationComponents(((MyApplication) getApplication()).applicationComponents)
                .build()
                .inject(this);
        Log.d(TAG, "onCreate: MainViewModel " + mainViewModel);
        Log.d(TAG, "onCreate: NetworkService " + mainViewModel.networkService);
        TextView txtHello = findViewById(R.id.txtHello);
        txtHello.setText(mainViewModel.getSampleData());
    }
}