package com.evillight.kotlindeneme

import java.util.*

fun main() {
    val girdi=Scanner(System.`in`)
    println("İsim Giriniz")
    val isim=girdi.next()
    println("Tekrar Sayısı Giriniz")
    val tekrar=girdi.nextInt()
    for (i in 0 until tekrar){
        println("${i+1}. $isim")
    }
}