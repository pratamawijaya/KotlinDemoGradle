package com.pratama.kotlindemogradle

import io.reactivex.Observable
import io.reactivex.Single
import java.math.BigDecimal

data class Character(val name: String, val house: String)

fun main(args: Array<String>) {

//    var name: String? = null
//
//    println("$name")
//
//    val nameLen = name?.length
//
//    println("panjang $nameLen")
//
//    val chars = mutableListOf(Character("Arya", "Stark"),
//            Character("Cersei", "Lannister"),
//            Character("Jamie", "Lannister"),
//            Character("Bran", "Stark")
//    )

//    println("size 10000 ${calculatePrice(10000)}")
//    println("size 10001 ${calculatePrice(10001)}")

    for (i in 10000..10010) {
        println("luas tanah $i m2 price Rp ${calculatePrice(i)}")
    }

}

fun calculatePrice(size: Int): Int {
    val defaultPrice = 3500000
    return if (size <= 10000) defaultPrice else defaultPrice + ((size - 10000) * 350)
}