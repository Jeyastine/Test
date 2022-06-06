package com.jeyastine.systemapp

import android.os.Bundle
import androidx.annotation.RequiresPermission
import androidx.annotation.RequiresPermission.Read
import androidx.annotation.RequiresPermission.Write
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textHelloWorld.setOnClickListener {

        }
    }
}