package com.example.meinarabischkurs

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {

    private val DURATION : Long = 500
    var DELAY_TIME : Long = 3000
    val mDelayHandler: Handler = Handler()

    val runnable: Runnable = Runnable {
        run(){
            val intent : Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override  fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_layout)
        //mDelayHandler.postDelayed(runnable, DELAY_TIME)


        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()


        },DURATION)
    }



}