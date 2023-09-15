package com.example.hoteloverview

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        with(supportActionBar) {
            this?.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM)
            this?.setCustomView(R.layout.action_bar_title)
            this?.hide()
        }
    }
}