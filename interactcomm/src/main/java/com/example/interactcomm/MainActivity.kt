package com.example.interactcomm

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {

            val int = Intent(
                    this@MainActivity,
                    DashActivity::class.java
            )
                 val bnd = Bundle()
            bnd.putString("my_name",etTx.text.toString())

            int.putExtras(bnd)
            startActivity(int)
                finish()
        }
    }
}
