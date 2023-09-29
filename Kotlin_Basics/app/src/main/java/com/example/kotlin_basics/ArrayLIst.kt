package com.example.kotlin_basics
// array list //

fun main()
{
    val arrayList : ArrayList<Int> = ArrayList()
    arrayList.add(90)
    println(arrayList.size)

    // lambda expression //
    val sum:(Int , Int ) -> Int = {a:Int , b:Int -> a+b}
    val add={a:Int , b:Int -> println(a+b)}
    add(3,7)


}