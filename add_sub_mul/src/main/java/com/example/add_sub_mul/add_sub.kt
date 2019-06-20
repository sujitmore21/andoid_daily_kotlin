package com.example.add_sub_mul

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_add_sub.view.*

class add_sub : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_sub)

        fun main(args: Array<String>) {

            val et1 = findViewById<EditText>(R.id.et1)

            val et2 = findViewById<EditText>(R.id.et2)

            val btadd = findViewById<Button>(R.id.add)

            val btsub = findViewById<Button>(R.id.sub)

            val btmul = findViewById<Button>(R.id.mul)

            val btdiv = findViewById<Button>(R.id.div)

            val txSt = findViewById<TextView>(R.id.txSt)

            btadd.setOnClickListener {
                if (et1.text.toString() == "" && et2.text.toString()==""){
                    txSt.text = ""
                }else{
                    txSt.text = "Error"
                }
            }
        }
    }
}
