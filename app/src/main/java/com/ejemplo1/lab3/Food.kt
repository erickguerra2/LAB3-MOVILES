package com.ejemplo1.lab3

abstract class Food(val name: String, val price: Double){
    abstract fun cook(): String
}

fun Food.discountedPrice (porcentaje: Int): Double{
    val descuento = price*(porcentaje/100.0)
    return price-descuento
}






