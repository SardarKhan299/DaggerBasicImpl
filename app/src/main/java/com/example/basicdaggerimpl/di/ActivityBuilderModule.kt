package com.example.basicdaggerimpl.di

import com.example.basicdaggerimpl.AuthActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract fun contributeAuthActivity() :AuthActivity

}