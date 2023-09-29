package com.example.kotlin_basics


class outer(){
    val name:String = "SId"
    class inner{
        val description : String = "HEllo its the inner class which in static"
    }

}
fun main(){
    println(outer.inner().description)
}