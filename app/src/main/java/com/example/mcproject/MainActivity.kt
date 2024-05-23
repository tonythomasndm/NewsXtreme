package com.example.mcproject


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.mcproject.HomeActivity.Companion.appContext

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Only start SplashActivity if it's not already running
        if (!intent.getBooleanExtra("FROM_SPLASH", false)) {
            val splashIntent = Intent(this, SplashActivity::class.java)
            splashIntent.putExtra("FROM_MAIN", true)
            startActivity(splashIntent)
        }
        appContext = applicationContext

    }



}