package com.example.kotlin_basics


data class User(val id:Long , var name:String)

fun main(){
    val user1 = User(1 , "Sid")
    user1.name = "Michel"
    println("${user1.id} and ${user1.name}")
    val iser2 = User(1 , "Michel")
    println(user1 == iser2)

    val copyUser = user1.copy(name = "Sid")
    println(copyUser.component2())
    val(id , nam) = copyUser
    println("id is $id and name is $nam")
}