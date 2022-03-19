package com.example.aot

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_AOT)
        setContentView(R.layout.activity_main)
        bottomNavigationView.background = null
        bottomNavigationView.menu.getItem(2).isEnabled = false

//        window.setFlags(
//            WindowManager.LayoutParams.FLAG_FULLSCREEN,
//            WindowManager.LayoutParams.FLAG_FULLSCREEN
//        )
//        val slideAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_slide)
//
//
//        Handler().postDelayed ({
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//            finish()
//
//        }, 3000)
   }
}


