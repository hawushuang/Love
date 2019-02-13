package com.aa.love

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val typeface = Typeface.createFromAsset(assets, "myfont.otf")
        tv.typeface = typeface
        tree_view.setReadyListener {
            showTextView()
        }
    }

    private fun showTextView() {
        tv.visibility = View.VISIBLE
        val animation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        tv.startAnimation(animation)
        tv.postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
        }, 1500L)
    }

}
