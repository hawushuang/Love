package com.aa.love

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.transition.Explode

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.enterTransition = Explode().setDuration(2000)
    }
}
