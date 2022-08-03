package com.evillight.kotlindeneme

import java.util.*

fun main() {
    val girdi=Scanner(System.`in`)
    val Dersler=Array<String>(5){""}
    val notlar=Array<Int>(5){0}
    for (i in 0 until Dersler.count()){
        println("${i+1}. Dersi Giriniz")
        Dersler[i]=girdi.next()
        println("${i+1}. Notunuzu Giriniz")
        notlar[i]=girdi.nextInt()
    }
    var toplam=0
    for (i in 0 until notlar.count()){
        println("${Dersler[i]} : ${notlar[i]}")
        toplam=toplam+notlar[i]
    }
    val ortalama=toplam/notlar.count()
    if (ortalama>50){
        println("Ortalamanız : $ortalama Geçtiniz")}
    else{
        println("Ortalamanız : $ortalama Kaldınız")}
}