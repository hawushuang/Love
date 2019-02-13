package com.aa.love

import android.app.ActivityOptions
import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.transition.Fade
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        window.exitTransition = Fade().setDuration(2000)
        val typeface = Typeface.createFromAsset(assets, "myfont.otf")
        tv1.typeface = typeface
        tree_view.setReadyListener {
            showTextView(tv1)
        }
    }

    private fun showTextView(tv: View) {
        tv.visibility = View.VISIBLE
        val animation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        tv.startAnimation(animation)
        tv.postDelayed({
            startActivity(
                Intent(this, MainActivity::class.java),
                ActivityOptions.makeSceneTransitionAnimation(this).toBundle()
            )
        }, 1500L)
    }

}
