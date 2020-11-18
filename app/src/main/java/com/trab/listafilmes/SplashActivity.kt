package com.trab.listafilmes

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    val scope = CoroutineScope(Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val context = this
        scope.launch {
            delay(2000)
            val intent = Intent(context, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}