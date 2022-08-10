package com.example.basicdaggerimpl.di

import android.app.Application
import com.example.basicdaggerimpl.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [AndroidSupportInjectionModule::class, ActivityBuilderModule::class, AppModule::class])
interface AppComponent : AndroidInjector<BaseApplication>{

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(app: Application):Builder
        fun build(): AppComponent
    }
}