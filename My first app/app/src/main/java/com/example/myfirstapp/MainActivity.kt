package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myButton = findViewById<Button>(R.id.bttn1)
        val textView = findViewById<TextView>(R.id.txtV1)
        var count = 0
        myButton.setOnClickListener {
            textView.text = "You clicked the button: ${++count} times."
            Toast.makeText(this , "Hey it's a loast",Toast.LENGTH_LONG).show()
        }

    }
}