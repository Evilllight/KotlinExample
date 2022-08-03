package com.evillight.kotlindeneme

import java.util.*

fun main() {
    val girdi=Scanner(System.`in`)
    println("Toplama (1)\nÇıkarma (2)\nÇarpma (3)\nBölme (4)")
    val tercih=girdi.nextInt()
    println("Birinci Sayıyı giriniz")
    val sayi1=girdi.nextInt()
    println("İkinci Sayıyı giriniz")
    val sayi2=girdi.nextInt()
    when(tercih){
        1-> println("Toplam : ${sayi1+sayi2}")
        2-> println("Çıkarma : ${sayi1-sayi2}")
        3-> println("Çarpım : ${sayi1*sayi2}")
        4-> println("Bölüm : ${sayi1/sayi2}")
        else-> println("1 ile 4 arasında seçim yapınız")
    }
}