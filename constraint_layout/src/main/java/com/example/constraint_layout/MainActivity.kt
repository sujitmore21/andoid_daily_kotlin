package com.example.constraint_layout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     val cal =findViewById<CalendarView>(R.id.cal)
        val txtAg = findViewById<TextView>(R.id.txtAge)

        cal.setOnDateChangeListener { _ , year, month, dayOfMonth -> //View - which view is call //is not use View - use "-"
            txtAg.text= ageobj.calAge(year,month,dayOfMonth).toString() }
    }
}
