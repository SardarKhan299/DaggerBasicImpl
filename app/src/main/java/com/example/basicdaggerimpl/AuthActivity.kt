package com.example.basicdaggerimpl

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.RequestManager
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

 class AuthActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var someString: String

     @set:Inject
     internal var isAppNull: Boolean = true

     @Inject
     lateinit var logo: Drawable

     @Inject
     lateinit var requestManager: RequestManager


     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        Log.d(AuthActivity::class.simpleName, "onCreate: $someString")
         Log.d(AuthActivity::class.simpleName, "onCreate: $isAppNull")
         setLogo()
    }

     private fun setLogo(){
         requestManager.load(logo).into(findViewById<ImageView>(R.id.login_logo))
     }
}