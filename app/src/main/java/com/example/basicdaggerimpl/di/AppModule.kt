package com.example.basicdaggerimpl.di

import android.app.Application
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.example.basicdaggerimpl.R
import dagger.Module
import dagger.Provides

// Dependencies that are not related to Activities. (retrofit Instance , glide instance etc)
@Module
class AppModule {
    @Module
    companion object {
        @JvmStatic @Provides
        fun getString() = "this is a test string"

        @JvmStatic @Provides
        fun getApp(app:Application):Boolean{
           return app == null
        }

        @JvmStatic @Provides
        fun provideRequestOptions():RequestOptions{
            return RequestOptions().placeholder(R.drawable.ic_launcher_background)
                    .error(R.drawable.ic_launcher_background)
        }

        @JvmStatic @Provides
        fun provideGlideInstance(app: Application,requestOptions: RequestOptions):RequestManager{
            return Glide.with(app).setDefaultRequestOptions(requestOptions)
        }

        @JvmStatic @Provides
        fun provideAppDrawable(app: Application):Drawable{
            return ContextCompat.getDrawable(app,R.drawable.ic_baseline_android_24)!!
        }

    }
}