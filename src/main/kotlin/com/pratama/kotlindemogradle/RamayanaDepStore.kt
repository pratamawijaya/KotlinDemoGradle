package com.pratama.kotlindemogradle


/**
 * Created by omayib on 22/05/17.
 */
fun main(args: Array<String>) {
    val tShirtUbuntu = TShirt(70000, 2)
    val tShirtAndroid = TShirt(50000, 4)
    val tShirtCoder = TShirt(80000, 3)

    val bill = Bill()
    bill.add(tShirtUbuntu)
    bill.add(tShirtAndroid)
    bill.add(tShirtCoder)

    val priceUsingDefaultMethod = bill.calculate(DefaultPricing())
    val priceUsingSpesialMethod = bill.calculate(SpecialPricing())
    val priceUsingNewYearMethod = bill.calculate(NewYearPricing())

    println(String.format("the total price is %d", priceUsingDefaultMethod))
    println(String.format("the total price with special discount is %d", priceUsingSpesialMethod))
    println(String.format("the total price with new year discount is %d", priceUsingNewYearMethod))
}


/**
 * TShirt is an item used for purchase simulation
 * */
data class TShirt(val price: Int, val numberOfCloth: Int)

/**
 * The Bill will be used to hold collection of t-shirts to be purchased
 * */
class Bill {
    var collection = ArrayList<TShirt>()

    fun add(tShirt: TShirt) {
        collection.add(tShirt)
    }

    fun calculate(pricingMethod: Pricing): Int {
        val sum = collection.map { it.price * it.numberOfCloth }.sum()
        return pricingMethod.calculate(sum)
    }

}

interface Pricing {
    fun calculate(sum: Int): Int
}

/**
 * The default price calculation without any discount
 * */
class DefaultPricing : Pricing {
    override fun calculate(sum: Int): Int {
        return sum
    }
}

/**
 * The total price is calculated by give a discount IDR 10.000 if purchase more than IDR 100.000
 * and discount IDR 25.000 if purchase more than IDR 200.000
 * */
class SpecialPricing : Pricing {
    override fun calculate(sum: Int): Int {
        var totalPrice = sum
        if (sum in 100001..200000) {
            totalPrice -= 10000
        } else if (totalPrice > 200000) {
            totalPrice -= 25000
        }
        return totalPrice

//        return when (sum) {

//        }

//        var totalPrice: Int = sum
//        return if (sum in 100001..200000) totalPrice -= 10000 else if (totalPrice > 200000) totalPrice -= 25000 else totalPrice
    }
}

/**
 * The total price is calculated by give a discount 25% sale
 * */
class NewYearPricing : Pricing {
    override fun calculate(sum: Int): Int {
        return sum * 75 / 100
    }
}
