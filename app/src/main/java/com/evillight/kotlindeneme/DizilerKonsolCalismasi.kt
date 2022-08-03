package com.evillight.kotlindeneme

import java.util.*

fun main() {
    val girdi=Scanner(System.`in`)
    val isimler= Array<String>(5){""}

    for (i in 0 until isimler.count()){
        println("${i+1}. İsim Giriniz")
        isimler[i]=girdi.next()
    }
    for ((index, isim) in isimler.withIndex()){
        println("${index+1}. İsim $isim")
    }
}