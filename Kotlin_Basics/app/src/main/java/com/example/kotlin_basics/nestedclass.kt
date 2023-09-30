package com.example.kotlin_basics

import android.icu.number.IntegerWidth


class outer(){
    val name:String = "SId"
    // nested class cant excess outer class methods but inner does //
    inner class inner{
        val description : String = "HEllo its the inner class which in static"
        fun foo(){
            println("Hello ${name}")
        }
    }

}


fun getNumber(s: String):Int {
    return try{
        Integer.parseInt(s)
    }catch (e:ArithmeticException){
        0
    }
}

fun main(){
    println(outer().inner().description)
    val v = outer().inner()
    v.foo()
    val str = getNumber("10")



}