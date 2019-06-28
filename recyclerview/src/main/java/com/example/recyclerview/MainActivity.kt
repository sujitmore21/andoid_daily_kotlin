package com.example.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.my_item.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        initRecyclerView()

    }

    private fun initRecyclerView() {
        val et = findViewById<EditText>(R.id.editText)

        /*val myAdapter = MyAdapter(
            this,
            recyclerData() , fun( pos : Int, data : MyData) {
                Log.i("@codekul", "In Main Activity $pos => $data")
                et.setText(data.text)
            }
        )*/

        val myAdapter = MyAdapter(
            this,
            recyclerData()
        ) { pos, dataM ->
            et.setText(dataM.text)
        }

        val viewManager = LinearLayoutManager(this)
        val recVw = findViewById<RecyclerView>(R.id.recVw)
        recVw.apply {

            setHasFixedSize(true)

            // use a linear layout manager
            layoutManager = viewManager

            // specify an viewAdapter (see also next example)
            adapter = myAdapter
        }

        hi(40, fun(){

        })

        hi(10, {

        }) // last parameter is function

        hi(10) {

        }
    }

    private fun recyclerData(): ArrayList<MyData> {
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
        return dataSet
    }

    private fun hi(  num : Int, fn : () -> Unit) {

    }
}

