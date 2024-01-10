package com.example.kotlin_basics

class Dog {
    var name: String = ""
    var breed: String = ""
    var age: Int = 0
    constructor(name: String , breed: String){
        this.name = name
        this.breed = breed
    }
    constructor(name: String , breed: String , age: Int){
        this.name = name
        this.breed = breed
        this.age = age
    }
    init{

        bark()

    }
    fun bark() {
        print("says Woof!")
    }

}