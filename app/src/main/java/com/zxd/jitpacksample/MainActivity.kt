package com.zxd.jitpacksample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zxd.jitlib.CalUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(CalUtils.add(1,2))
    }
}