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
// git config --global user.name "Jeyastine"  git config --global user.email "jeyastinepushparaj@gmail.com"
//  https://github.com/RamprasathPnr/DPC_AndroidApplication/blob/master/app/src/main/AndroidManifest.xml
//  repo init -u https://github.com/Jeyastine/SystemApp.git -b android-12.0.0_r28   src/main/AndroidManifest.xml