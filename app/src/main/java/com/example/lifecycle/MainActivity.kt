package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var myData =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("MainActivity", "onCreate")

        val tv:TextView = findViewById<TextView>(R.id.tvResult)

        if (savedInstanceState != null) {
            myData = savedInstanceState.getString("myValue").toString()
            tv.text = myData
        }


        val btnSetValue:Button = findViewById(R.id.btnSetValue)

        btnSetValue.setOnClickListener{
            myData = "AAAAAA"
            findViewById<TextView>(R.id.tvResult).text = myData
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("myValue", myData)
    }

    override fun onStart(){
        super.onStart()
        Log.i("MainActivity", "onStart")
    }

    override fun onResume(){
        super.onResume()
        Log.i("MainActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "onDestroy")
    }
}