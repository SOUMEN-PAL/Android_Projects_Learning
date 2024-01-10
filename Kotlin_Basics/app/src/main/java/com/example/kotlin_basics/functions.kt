package com.example.kotlin_basics

import java.math.BigInteger




data class  CoffeDetails(
    val sugarCount: Int,
    val size: Int
)
fun makeCoffee(CoffeDetails:CoffeDetails): Int{
    if(CoffeDetails.sugarCount == 1){
        println("Too")
        return 1;
    }
    println("Buy Beans")
    return 3;
}

fun add():Int{
    val num1: Int = readln().toInt()
    val num2: Int = readln().toInt()
    return num1 + num2
}
fun main() {
    // Immutable list //
    val shoppingList = listOf("Processor", "Motherboard", "RAM", "Graphics Card")

    // Mutable list //
    val shoppingList2 = mutableListOf("Processor", "Motherboard", "RAM", "Graphics Card")
    shoppingList2.add(0 , "SsfsdfSD")
    shoppingList2[0] = shoppingList2[0].uppercase()
    println(shoppingList2)
    println(shoppingList.contains("Graphics Card"))

    for((index ,item) in shoppingList.withIndex()){
        if(item == "RAM" && index == 2){
            println("Found")
        }
    }




}