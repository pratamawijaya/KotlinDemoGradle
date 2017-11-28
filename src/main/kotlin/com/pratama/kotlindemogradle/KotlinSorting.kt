package com.pratama.kotlindemogradle

import java.math.BigDecimal
import java.util.*

data class FlightSchedule(val departureTime: Date, val arrivalTime: Date, val price: BigDecimal, val airline: String, val duration: Int)

fun main(args: Array<String>) {

    val data = listOf(
            FlightSchedule(departureTime = dateParse("2017-11-28 20:30:00"),
                    arrivalTime = dateParse("2017-11-28 22:30:00"),
                    price = BigDecimal(1000000),
                    airline = "Garuda",
                    duration = 120), FlightSchedule(departureTime = dateParse("2017-11-28 16:30:00"),
                    arrivalTime = dateParse("2017-11-28 18:30:00"),
                    price = BigDecimal(1200000),
                    airline = "Garuda",
                    duration = 100), FlightSchedule(departureTime = dateParse("2017-11-28 10:30:00"),
                    arrivalTime = dateParse("2017-11-28 12:30:00"),
                    price = BigDecimal(800000),
                    airline = "Sriwijaya",
                    duration = 120), FlightSchedule(departureTime = dateParse("2017-11-28 06:30:00"),
                    arrivalTime = dateParse("2017-11-28 08:30:00"),
                    price = BigDecimal(800000),
                    airline = "Air Asia",
                    duration = 80)
    )

    println("##before sorted##")
    data.map {
        println("-- ${it.airline} -- ${it.price} -- ${it.departureTime.asString()}")
    }

    println("##after sorted by airline##")
    val sortedList = data.sortedWith(compareBy({ it.airline }))
    sortedList.map {
        println("-- ${it.airline} -- ${it.price} -- ${it.departureTime.asString()}")
    }

    println("##after sorted by price##")
    val sortedList2 = data.sortedWith(compareBy({ it.price }))
    sortedList2.map {
        println("-- ${it.airline} -- ${it.price} -- ${it.departureTime.asString()}")
    }

    println("##after sorted by departure time##")
    val sortedList3 = data.sortedWith(compareBy({ it.departureTime }))
    sortedList3.map {
        println("-- ${it.airline} -- ${it.price} -- ${it.departureTime.asString()}")
    }

}