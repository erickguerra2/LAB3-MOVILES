package com.ejemplo1.lab3

fun main() {
    val Hamburguesa = Burger("Hamburguesa", 20.0)
    val pizza = Pizza("Pizza", 50.0)
    val helado = IceCream("Helado", 20.0)
    val jugo = Juice("Jugo", 10.0)
    val descuento = Hamburguesa.discountedPrice(25)

    println("${Hamburguesa.name}: ${Hamburguesa.cook()}")
    println("${pizza.name}: ${pizza.cook()}")
    println("${helado.name}: ${helado.cook()}")
    println("${jugo.name}: ${jugo.cook()}")
    println("${helado.name}: ${helado.eat()}")
    println("${jugo.name}: ${jugo.pour()}")

    println("Descuento para la hamburguesa: $descuento")
}