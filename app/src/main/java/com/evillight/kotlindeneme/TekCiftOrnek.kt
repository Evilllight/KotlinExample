package com.evillight.kotlindeneme

import java.util.*

fun main() {
    val girdi=Scanner(System.`in`)
    while (true){
        println("Sayı Giriniz")
        val sayi=girdi.nextInt()
        val sonuc =sayi%2
        if (sonuc==0){
            println("Çift Sayı Girdiniz")
        }
        else{
            println("Tek Sayı Girdiniz5")}
        println("Çıkmak için 1'e Basınız - Devam Etmek için Diğer Sayılar")
        val cikis=girdi.nextInt()
        if (cikis==1){
            println("Çıkış Yapıldı")
            break}
    }
}