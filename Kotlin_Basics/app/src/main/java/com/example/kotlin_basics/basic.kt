package com.example.kotlin_basics


class person(Name : String)
{
    val name = Name
    var age : Int? = null
    var hobby : String = "Watching netflix"

    constructor(Name: String , age : Int)
        : this(Name){
            this.age = age
        }

    fun stateHobby(){
        println("${this.name}'s hobby is $hobby")
    }
}


fun main(){
    var Dennis = person("Dennis" , 23)
    Dennis.hobby = "Playing football"
    Dennis.stateHobby()
    Dennis.age = 32
    println(Dennis.age)
}