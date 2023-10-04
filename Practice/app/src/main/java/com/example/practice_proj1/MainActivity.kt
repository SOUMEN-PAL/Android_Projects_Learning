package com.example.practice_proj1

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class MainActivity : AppCompatActivity() {
    private var btn : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btn1)
        btn?.setOnClickListener {
            click()
        }

    }


    fun click(){
        val text:TextView = findViewById(R.id.Text1)
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val date = calendar.get(Calendar.DAY_OF_MONTH)
//        Toast.makeText(this , "working" , Toast.LENGTH_LONG).show()

        val datepicker = DatePickerDialog(this,
            DatePickerDialog.OnDateSetListener { view, year, month, date ->
               val sdf = SimpleDateFormat("yyyy.MM.dd" , Locale.ENGLISH)
                Toast.makeText(this , "${sdf.parse(sdf.format(System.currentTimeMillis()))}" , Toast.LENGTH_LONG).show()

            },
            year,
            month,
            date
        )
        datepicker.datePicker.maxDate = System.currentTimeMillis()
        datepicker.show()


    }
}