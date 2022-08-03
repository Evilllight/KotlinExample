package com.evillight.kotlindeneme

fun main() {

    for(i in 3..6){
        println("Döngü 1 : $i")}

    var sayac =3
    while (sayac<9){
        println("Döngü 2 : $sayac")
        sayac+=1
    }

    for (i in 0..8 step 2){
        println("Döngü 3 : $i")
    }

    var sayac1 =0
    while (sayac1<9){
        println("Döngü 4 : $sayac1")
        sayac1 +=2
    }

    for (i in 8 downTo 0 step 2){
        println("Döngü 5 : $i")
    }

    var sayac2= 13
    while (sayac2>=0){
        println("Döngü 6 : $sayac2")
        sayac2 -=2
    }
}