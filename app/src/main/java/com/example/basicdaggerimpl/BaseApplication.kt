package com.example.basicdaggerimpl

import android.util.Log
import com.example.basicdaggerimpl.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class BaseApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication?>? {
        return DaggerAppComponent.builder().application(this).build()
    }

}