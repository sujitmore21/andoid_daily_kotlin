package com.example.gst_calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit_total = findViewById<EditText>(R.id.edit_total)
        val edit_percentage = findViewById<EditText>(R.id.edit_percentage)
        val total_amount = findViewById<TextView>(R.id.total_amount)
        val gst_amount = findViewById<TextView>(R.id.gst_amount)

        val calculate = findViewById<Button>(R.id.calculate)

        calculate.setOnClickListener {

            val total = Integer.parseInt(edit_total.text.toString())
            val percentage = Integer.parseInt(edit_percentage.text.toString())
            val amount = Math.round((total * 100 / (100 + percentage)).toFloat())
            total_amount.text = "Net Amount is " + Integer.toString(amount)

            val gst = total - amount
            gst_amount.text = "GST Amount is " + Integer.toString(gst)
        }


   }
}
