package com.influx.mysamplemvp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Selva Ganesh on 04-01-2017.
 */
public abstract class BaseActivity extends AppCompatActivity {


    public Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        activity = this;
        initview();
        initdata();

    }

    public abstract int getContentView();

    public abstract void initview();

    public abstract void initdata();


}
