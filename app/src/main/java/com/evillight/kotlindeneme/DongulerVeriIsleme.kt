package com.evillight.kotlindeneme

import java.util.*

fun main() {
    val girdi=Scanner(System.`in`)
    println("İşlenecek Veri Miktarını Giriniz")
    var tekrar=girdi.nextInt()
    while (tekrar>0){
        println("$tekrar. veri")
        tekrar=tekrar-1
    }
}