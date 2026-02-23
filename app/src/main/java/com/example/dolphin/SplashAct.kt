package com.example.dolphin

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import com.example.dolphin.databinding.ActivitySplashBinding
import com.example.dolphin.core.ui.prespentation_layer.MainActivity
import kotlinx.coroutines.*

class SplashAct : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding
    private var coroutineScope: Job? = null
    private val NAVIGATION_DELAY = 1 * 1000L // 2 sec of delay
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.statusBarColor = ContextCompat.getColor(this, R.color.air_red_dark)

        coroutineScope = CoroutineScope(Job() + Dispatchers.Main).launch {
            delay(NAVIGATION_DELAY)

            coroutineScope?.let {
                if (it.isActive) {
                        val intent = Intent(this@SplashAct, MainActivity::class.java)
                        startActivity(intent)
                        finish()
                }
            }
        }
    }
}