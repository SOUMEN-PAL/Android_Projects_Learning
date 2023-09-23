package com.example.kotlin_basics

import android.renderscript.ScriptGroup.Binding

interface Driveable{
    val maxSpeed:Double
    fun drive():String
    fun brake(){
        println("The driveable is braking")
    }
}

open class Car(val name:String ,val brand : String):Driveable{
    open var range : Double = 0.0
    override val maxSpeed: Double = 30.0

    open fun extendRange(amount:Double){
        if(amount > 0){
            range += amount
        }
    }
    open fun drive(distance : Double){
        println("Drove distance $distance")
    }

    override fun drive(): String {
        return "Hello"
    }
}


class Electric(name: String, brand: String, batteryLife:Double ) : Car(name, brand) {

    override var range = batteryLife * 6
    var chargerType = "Type1"
    override fun drive(distance: Double) {
        println("Drove for $distance KM on elctricity")
    }
    override fun drive():String{
        return "Drove for $range KM on elctricity"
    }

}
fun main(){

    var audiA3 = Car("A3" , "Audi")
    var teslaS = Electric("S-Model" ,"Tesla" , 80.0)

    audiA3.drive(200.0)
    teslaS.drive(200.0)
    teslaS.drive()
    teslaS.brake()
    println(teslaS.chargerType)



}