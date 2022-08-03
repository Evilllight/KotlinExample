package com.evillight.kotlindeneme

import java.util.*

fun main() {
    val girdi=Scanner(System.`in`)
    println("Sil (1) \n Ekle (2)")
    val tercih = girdi.nextInt()
    when(tercih){
        1-> println("Veri Silindi")
        2-> println("Veri Eklendi")
        else -> println("Böyle Bir İşlem Yok")
    }
}