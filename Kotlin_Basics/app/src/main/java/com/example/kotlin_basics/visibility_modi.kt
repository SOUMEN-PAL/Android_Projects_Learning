package com.example.kotlin_basics

import java.util.Base64
import kotlin.properties.Delegates

open class base(){
    var a = 1
    private var b = 2
    protected open val c = 3
    internal val d = 4
    protected fun e(){}

}

class Derived : base(){
    val k = a
    override val c = 30
}

fun main(args: Array<String>){
    var base = base()
    base.a
    val derived = Derived()

}