package com.evillight.kotlindeneme

fun main() {
    val hours = readLine()!!.toInt()
    var total  = hours.toDouble()

    if (hours < 24 && hours > 5){
        total=5.0+((total-5.0)*0.5)
        println(total)
    }
    else if (hours>24){
        total = 15.0 + ((total-24)*0.5)
        println(total)
    }
    else(println(total))

}