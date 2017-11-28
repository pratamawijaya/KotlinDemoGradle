package com.pratama.kotlindemogradle

fun main(args: Array<String>) {


//    for (i in 1..100) {
//        when {
//            i % 3 == 0 -> println("$i Fizz")
//            i % 5 == 0 -> println("$i Buzz")
//            (i % 3 == 0) and (i % 5 == 0) -> println("$i FizzBuzz")
//        }

//        if (i % 3 == 0) println("$i Fizz")
//        else if (i % 5 == 0) println("$i Buzz")
//        else if (i % 3 == 0 && i % 5 == 0) println("$i FizzBuzz")
//    }

    for (i in 1..100) {
        when {
            i.fizz() -> "Fizz"
            i.buzz() -> "Buzz"
            i.fizzBuzz() -> "FizzBuzz"
        }
    }
}

fun Int.fizz(): Boolean = this % 3 == 0
fun Int.buzz(): Boolean = this % 5 == 0
fun Int.fizzBuzz(): Boolean = this.fizz() && this.buzz()