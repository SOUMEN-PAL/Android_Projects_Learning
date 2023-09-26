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
    println(newFruits.elementAt(4))


    // map collection key : value pair //
    // syntax {key to value} //

    val mp = mapOf(1 to "Mon" , 2 to "Tue" , 3 to "Wed" , 4 to "Thru" , 5 to "Fri" , 6 to "Sat" , 7 to "Sun")
    for((key , value) in mp){
        println("$key $value")
    }
    println("")
    val fri = mutableMapOf<Int , F>(1 to F("Grape" , 2.5) , 2 to F("Apple" , 23.5) , 3 to F("Oranges" , 3.55))
    fri.put(4 , F("tomatos" , 45.66))
    for((key , value) in fri){
        println("$key ${value.name}")
    }

}

data class  F(val name: String, val price: Double)