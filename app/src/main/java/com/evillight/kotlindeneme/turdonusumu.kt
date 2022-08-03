package com.evillight.kotlindeneme

import java.lang.Exception

fun main() {
    /*
    var i:Int = 14
    var f:Float= 1.23f
    var d:Double= 1.2

    var sonuc1: Int =d.toInt()
    var sonuc2:Float=i.toFloat()
    var sonuc3:Double=f.toDouble()
    var sonuc4=i.toString()
    var sonuc5=f.toString()
    var sonuc6=d.toString()
    println("$sonuc1 , $sonuc2 , $sonuc3 , $sonuc4 , $sonuc5 , $sonuc6")
    */

    /// String To Int

    var yazi = "1f"
   try {
    var x = yazi.toInt()
       println(x)
   }catch (e:Exception){
       println("Try")}

    // 2
    var yazi2 = "46"
    var y =yazi2.toDoubleOrNull()
    if (y != null){
        println(y)}
    else{
        println("hataaa")}

    //3

    var x = "3m3"
    var q =x.toIntOrNull()
    q?.let { println(q) }
}