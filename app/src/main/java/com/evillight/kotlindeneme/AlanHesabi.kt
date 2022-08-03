package com.evillight.kotlindeneme

import java.util.*

fun main() {
    val girdi= Scanner(System.`in`)

    println("Dikdörtgen Alannı (1)")
    println("Çember Alannı (2)")

    val secim =girdi.nextInt()

    println("Seçiminiz : $secim")

    if (secim == 1){
        println("Kısa Kenar Giriniz")
        val kısaKenar=girdi.nextInt()
        println("Uzun Kenar Giriniz")
        val uzunKenar=girdi.nextInt()
        println("Dikdörtgen Alanı")
        val Dalan =kısaKenar*uzunKenar
        println("Dikdöertgen Alanı = $Dalan")
        }
    if (secim == 2){
        println("Yarıçap Giriniz")
        val Yaricap = girdi.nextInt()
        val Calan = Yaricap*Yaricap*3.14
        println("Çember Alanı : $Calan")
    }
    return
}