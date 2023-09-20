package com.example.kotlin_basics

class car(carBrand:String){

    lateinit var owner:String
    init {
        owner = "Frank"
    }

    val myBrand = "bmw"
        get() {
            return field.uppercase()

        }
    var speed = 20
        set(value) {
            field = value.toInt() + 100
        }
}


fun main(){

    var myCar = car("BMW")
    println(myCar.owner)
    println(myCar.myBrand)
    myCar.speed = 40
    println(myCar.speed)
}
