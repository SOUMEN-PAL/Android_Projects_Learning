package com.example.kotlin_basics



data class Fruit(val name:String , val price:Double)

fun main(){

//    val numbers:IntArray = intArrayOf(1,2,5,87,4,9,8,5)
//    val numbers = intArrayOf(1,2,5,87,4,9,8,5)
    val numbers = arrayOf(1,2,5,87,4,9,8,5)
    for((j, i) in numbers.withIndex()){
        numbers[j] = i+2
    }
    println(numbers.contentToString())

    val m = numbers.withIndex()
    for(i in m){
        print("${i.index} ")
    }

    val arr : Array<Pair<Int , Int>> = arrayOf(1 to 2 , 2 to 3 , 3 to 4 , 4 to 5)
    for((i,j) in arr){
        println("$i $j")
    }

    val fruits = arrayOf(Fruit("Apple" , 2.0) , Fruit("Banana" , 5.0))
    println(fruits.contentToString())
// we cant add new values in arrays for the we have list //



}