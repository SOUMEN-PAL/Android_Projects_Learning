package com.example.kotlin_basics


// set is a container which eliminates the duplicate data //


fun main(){


    val fruits = setOf("Orange" , "Apple" , "Grape" , "Apple" , "orange")
    println(fruits.size)
    println(fruits.toSortedSet())

    // Mutable set //
    val newFruits = fruits.toMutableSet()
    newFruits.add("Papaya")
    newFruits.add("Tomato")
    println(newFruits)

}