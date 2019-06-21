package com.example.relativelayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mydemolibrary.car

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cr = car()
    }
}
