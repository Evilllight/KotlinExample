package com.evillight.kotlindeneme

import java.util.*

fun main() {
    val girdi=Scanner(System.`in`)
    println("Toplama (1)")
    println("Çıkarma (2)")
    println("Çarpma (3)")
    println("Bölme (4)")
    val secim =girdi.nextInt()
    println("Birinci Sayıyı Giriniz")
    val sayi1 =girdi.nextInt()
    println("İkinci Sayıyı Giriniz")
    val sayi2=girdi.nextInt()
    if (secim==1){ println("Toplama = ${sayi1+sayi2}")}
    else if (secim==2){println("Çıkarma = ${sayi1-sayi2}")}
    else if (secim==3){println("Çarpma = ${sayi1*sayi2}")}
    else if(secim==4){println("Bölme = ${sayi1/sayi2}")}

}