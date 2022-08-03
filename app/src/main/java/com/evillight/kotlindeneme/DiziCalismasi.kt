package com.evillight.kotlindeneme

fun main() {
    /*
    val dizi1= Array<Int>(5){0}
    val dizi2= arrayOf(1,0,7)
    val dizi3= arrayOf<Int>(2,4,6)
    val dizi4= arrayOf<String>("at","kafası")
    val dizi5= arrayOf("at",2,"kafası")*/

    val meyveler= arrayOf<String>("çilek","muz","elma","kivi","kiraz")

    val str1=meyveler[2]
    println(str1)

    val str2=meyveler.get(3)
    println(str2)

    meyveler[1]="yeni muz"
    println(meyveler.contentToString())

    meyveler.set(2,"yeni elma")
    println(meyveler.contentToString())

    //Array İşlemleri

    println(meyveler.isEmpty())
    println(meyveler.count())
    println(meyveler.first())
    println(meyveler.last())
    println(meyveler.indexOf("yeni elma"))
    println(meyveler.contains("muz"))
    println(meyveler.max())
    println(meyveler.min())
    println(meyveler.sort())
    println(meyveler.contentToString())
    println(meyveler.reverse())
    println(meyveler.contentToString())
}