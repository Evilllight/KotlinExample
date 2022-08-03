package com.evillight.kotlindeneme

fun main() {
    //Daire alanı
    val pi = 3.14
    var yarıcap=2.0
    var alan= pi* yarıcap* yarıcap
    println("Daire alanı : $alan")

    // Kuvvet
    var kütle = 12.5
    var ivme = 2.0
    var kuvvet= kütle * ivme
    println("Kuvvet = $kuvvet ")

    //Ax
    var v = 12.5
    var v0 = 2.7
    var t = 3.4
    var a= 2.3
    var x1= ((v+v0)/2)*t
    var x2 = (v0*t)+ (a*t*t)/2
    println("x1 = $x1")
    println("x2 = $x2")

    var y = 12
    y=y+2
    println("y = $y")

    y+=2
    println("y = $y")

    y-=3
    println("y = $y")


}