package com.example.madpractical8_20012021061

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashActivity : AppCompatActivity() , Animation.AnimationListener {
    lateinit var logo_image : ImageView
    lateinit var logoFramebyFeameAnimation : AnimationDrawable
    lateinit var twinAnimation: Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        logo_image = findViewById(R.id.img_view)
        logo_image.setBackgroundResource(R.drawable.uvpce_logo_list)
        logoFramebyFeameAnimation = logo_image.background as AnimationDrawable
        twinAnimation = AnimationUtils.loadAnimation(this,R.anim.ani)
        twinAnimation.setAnimationListener(this)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if(hasFocus){
            logoFramebyFeameAnimation.start()
            logo_image.startAnimation(twinAnimation)
        }else{
            logoFramebyFeameAnimation.stop()
        }
    }

    override fun onAnimationStart(p0: Animation?) {

    }

    override fun onAnimationEnd(p0: Animation?) {
        intent = Intent(this,MainActivity::class.java).apply { startActivity(this) }
    }

    override fun onAnimationRepeat(p0: Animation?) {

    }
}