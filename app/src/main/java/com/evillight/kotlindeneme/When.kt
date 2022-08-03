package com.evillight.kotlindeneme

import java.util.*

fun main() {
    val gun=Scanner(System.`in`)
    val sav=gun.nextInt()
    when(sav){
        1 -> println("pazartesi")
        2 -> println("salı")
        3 -> println("çarşamba")
        4 -> println("perşembe")
        5 -> println("cuma")
        6 -> println("cumartesi")
        7 -> println("pazar")
        8 -> println("expazartesi")
        9 -> println("exsalı")
        else-> println("1'den 9'a kadar sayı giriniz")
    }
}