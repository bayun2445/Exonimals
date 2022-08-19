package com.example.exonimals

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.splash_screen.*

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        tv_app_title.startAnimation(AnimationUtils.loadAnimation(this, R.anim.start_app_title))
        tv_sub_title.startAnimation(AnimationUtils.loadAnimation(this, R.anim.start_sub_title))

        Handler(Looper.getMainLooper()).postDelayed({
            Intent(this@SplashScreenActivity, MainActivity::class.java).also{
                startActivity(it)
                finish()
                this.overridePendingTransition(0, R.anim.exit_splash)
            }
        }, 1200)
    }
}