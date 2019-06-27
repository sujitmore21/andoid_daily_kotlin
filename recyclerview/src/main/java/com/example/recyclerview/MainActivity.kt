package com.example.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val dataSet = ArrayList<MyData>()
        dataSet.add(
            MyData(
                R.drawable.ic_mic_black_24dp,
                "Android"
            )
        )
        dataSet.add(
            MyData(
                R.drawable.ic_mic_black_24dp,
                "Apple"
            )
        )
        dataSet.add(
            MyData(
                R.drawable.ic_mic_black_24dp,
                "Samsung"
            )
        )
        dataSet.add(
            MyData(
                R.drawable.ic_mic_black_24dp,
                "Windows"
            )
        )
        dataSet.add(
            MyData(
                R.drawable.ic_mic_black_24dp,
                "Rim"
            )
        )
        val myAdapter = MyAdapter(
            this,
            dataSet
        )

        val viewManager = LinearLayoutManager(this)
        val recVw = findViewById<RecyclerView>(R.id.recVw)
        recVw.apply {

            setHasFixedSize(true)

            // use a linear layout manager
            layoutManager = viewManager

            // specify an viewAdapter (see also next example)
            adapter = myAdapter
        }
    }
}
