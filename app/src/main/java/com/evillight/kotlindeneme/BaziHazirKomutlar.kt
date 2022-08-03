package com.evillight.kotlindeneme

import kotlin.math.*
import kotlin.random.Random

fun main() {

    for (i in 0..10){
    val rastgeleSayi=Random.nextInt(0,10)
        println(rastgeleSayi)}

    val c= ceil(6.54)
    println("c = $c" )

    val f= floor(6.54)
    println("f=$f")

    val sqrt= sqrt(4.0)
    println("sqrt=$sqrt")

    val a= abs(-10)
    println("a=$a")

    val max= max(10.5,11.8)
    val min= min(4.5,5.6)
    println("max=$max, min=$min ")

    val p=2.0.pow(3.0)
    println("p=$p")
}