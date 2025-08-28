package com.example.lifecycleapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var lifecycleTextView: TextView
    private val lifecycleLog = StringBuilder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleTextView = findViewById(R.id.lifecycleTextView)
        lifecycleLog.append("onCreate called\n")
        lifecycleTextView.text = lifecycleLog.toString()
    }

    override fun onStart() {
        super.onStart()
        lifecycleLog.append("onStart called\n")
        lifecycleTextView.text = lifecycleLog.toString()
    }

    override fun onResume() {
        super.onResume()
        lifecycleLog.append("onResume called\n")
        lifecycleTextView.text = lifecycleLog.toString()
    }

    override fun onPause() {
        super.onPause()
        lifecycleLog.append("onPause called\n")
        lifecycleTextView.text = lifecycleLog.toString()
    }

    override fun onStop() {
        super.onStop()
        lifecycleLog.append("onStop called\n")
        lifecycleTextView.text = lifecycleLog.toString()
    }

    override fun onDestroy() {
        super.onDestroy()
        lifecycleLog.append("onDestroy called\n")

    }
}
