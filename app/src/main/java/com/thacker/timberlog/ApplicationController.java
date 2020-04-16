package com.thacker.timberlog;

import android.app.Application;

import timber.log.Timber;

public class ApplicationController extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
//            Timber.plant(new Timber.DebugTree());
//            Fabric.with(this, new Crashlytics());
            Timber.plant(new MyDebugTree());
        } /*else {
//            Fabric.with(this, new Crashlytics());
            Timber.plant(new CrashReportingTree(this));

        }*/
    }
}
