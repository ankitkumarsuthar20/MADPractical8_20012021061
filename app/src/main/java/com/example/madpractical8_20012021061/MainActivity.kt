package com.example.madpractical8_20012021061

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.widget.ImageView

class MainActivity : AppCompatActivity(), Animation.AnimationListener {
    lateinit var alarm_image: ImageView
    lateinit var alarmFramebyFeameAnimation: AnimationDrawable
    lateinit var heart_image: ImageView
    lateinit var heartFramebyFeameAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        alarm_image = findViewById(R.id.alarm_view)
        alarm_image.setBackgroundResource(R.drawable.alarm_list)
        alarmFramebyFeameAnimation = alarm_image.background as AnimationDrawable
        heart_image = findViewById(R.id.heart_view)
        heart_image.setBackgroundResource(R.drawable.heart_list)
        heartFramebyFeameAnimation = heart_image.background as AnimationDrawable

    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            alarmFramebyFeameAnimation.start()
        } else {
            alarmFramebyFeameAnimation.stop()
        }
        if (hasFocus) {
            heartFramebyFeameAnimation.start()
        } else {
            heartFramebyFeameAnimation.stop()
        }
    }

    override fun onAnimationStart(p0: Animation?) {

    }

    override fun onAnimationEnd(p0: Animation?) {
        intent = Intent(this, MainActivity::class.java).apply { startActivity(this) }
    }

    override fun onAnimationRepeat(p0: Animation?) {

    }
}