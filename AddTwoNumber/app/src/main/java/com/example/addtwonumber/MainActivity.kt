package com.example.addtwonumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num1 = findViewById<TextView>(R.id.Num1)
        val num2 = findViewById<TextView>(R.id.Num2)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            var n = num1.text.toString()
            var m = num2.text.toString()
            var res = m.toInt() + n.toInt()
            Toast.makeText(this , "The sum is ${res}", Toast.LENGTH_LONG).show()
        }
    }
}