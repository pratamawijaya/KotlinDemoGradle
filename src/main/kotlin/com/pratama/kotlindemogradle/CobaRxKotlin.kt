package com.pratama.kotlindemogradle

import io.reactivex.Observable
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.rxkotlin.toObservable

/**
 * Created by pratama on 7/13/17.
 */

fun main(args: Array<String>) {
    val list = listOf("Alpha", "Beta", "Gamma", "Delta", "Epsilon")

    // RxKotlin
    list.toObservable()
        .filter { it.length >= 5 }
        .subscribeBy(
            onNext = { println(it) },
            onError = { it.printStackTrace() },
            onComplete = { println("\nDone") }
        )

    // RxJava
    Observable.fromIterable(list)
        .filter { it.length >= 5 }
        .subscribe({
            result ->
            println(result)
        }, {
            error ->
            println("error $error")
        })
}