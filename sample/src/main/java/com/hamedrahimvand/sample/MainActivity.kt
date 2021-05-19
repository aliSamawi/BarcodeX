package com.hamedrahimvand.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


internal class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = BarcodeXActivity.getLauncherIntent(this)
        startActivity(intent)
        button.setOnClickListener {
            startActivity(intent)
        }
    }
}