package com.gh.ghmavendemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gh.lib_demo.DemoUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.btn_01).setOnClickListener {
            DemoUtils.toast(this@MainActivity, "测试一下")
        }
    }
}