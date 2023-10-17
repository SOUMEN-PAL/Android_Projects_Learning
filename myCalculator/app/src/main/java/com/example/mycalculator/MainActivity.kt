package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var tvInput : TextView? = null
    private var lastNumeric : Boolean = false
    private var lastDot : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvInput = findViewById(R.id.Output)
    }

    fun onDigit(view: View){
        tvInput?.append((view as Button).text)
        lastNumeric = true
        lastDot = false
    }

    fun onClear(view: View){
        tvInput?.text = ""
        lastNumeric = false
        lastDot = false
    }

    fun onDecimal(view: View){
        if(lastNumeric && !lastDot){
            tvInput?.append(".")
            lastNumeric = false
            lastDot = true
        }
    }

    //TODO: need to study the new func //

    fun onOperator(view: View) {
        val buttonText = (view as Button).text.toString()

        if (tvInput != null) {
            val currentInput = tvInput?.text.toString()

            if (currentInput.isEmpty()) {
                if (buttonText == "-") {
                    tvInput?.append(buttonText)
                    lastNumeric = false
                    lastDot = false
                }
            } else {
                if (currentInput.startsWith("-")) { // problem solved //
                    if (!isOperator(currentInput.substringAfter("-"))) {
                        tvInput?.append(buttonText)
                        lastNumeric = false
                        lastDot = false
                    }
                } else {
                    if (lastNumeric && !isOperator(currentInput)) {
                        tvInput?.append(buttonText)
                        lastNumeric = false
                        lastDot = false
                    }
                }
            }
        }
    }

    fun onEquals(view: View){
        var textViewValue = tvInput?.text.toString()
        var prefix = ""
        try{
            if(textViewValue.startsWith("-")){
                prefix = "-"
                textViewValue = textViewValue.substring(1 )
            }
            if(textViewValue.contains("-")){
                val splitvalue = textViewValue.split("-")

                var one = splitvalue[0]
                var two = splitvalue[1]
                if(prefix.isNotEmpty()){
                    one = prefix + one
                }
                tvInput?.text = removeZeroAfterDot ((one.toDouble() - two.toDouble()).toString())

            }
            else if(textViewValue.contains("+")){
                val splitvalue = textViewValue.split("+")

                var one = splitvalue[0]
                var two = splitvalue[1]
                if(prefix.isNotEmpty()){
                    one = prefix + one
                }
                var res = one.toDouble() + two.toDouble()
                tvInput?.text = removeZeroAfterDot (res.toString())
            }
            else if(textViewValue.contains("*")){
                val splitvalue = textViewValue.split("*")

                var one = splitvalue[0]
                var two = splitvalue[1]
                if(prefix.isNotEmpty()){
                    one = prefix + one
                }
                tvInput?.text = removeZeroAfterDot ((one.toDouble() * two.toDouble()).toString())
            }else if(textViewValue.contains("/")){
                val splitvalue = textViewValue.split("/")

                var one = splitvalue[0]
                var two = splitvalue[1]
                if(prefix.isNotEmpty()){
                    one = prefix + one
                }
                tvInput?.text =removeZeroAfterDot ((one.toDouble() / two.toDouble()).toString())
            }


        }catch (e: ArithmeticException){
            e.printStackTrace()
        }

    }

    private fun removeZeroAfterDot(result : String):String{
        var value = result
        if(result.contains(".0")){
            value = result.substring(0 , value.length - 2)
        }
        return value

    }


    private fun isOperator(value: String):Boolean{

           return value.contains("/")
                    || value.contains("*")
                    || value.contains("+")
                    || value.contains("-")
    }

}