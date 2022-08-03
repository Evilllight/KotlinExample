package com.evillight.kotlindeneme

fun main() {
    val meyveler= arrayOf<String>("çilek","muz","elma","kivi","kiraz")
    for (meyve in meyveler){
        println(meyve)}
    for ((index,meyve) in meyveler.withIndex()){
        println("Sonuç $index , $meyve")
    }
}