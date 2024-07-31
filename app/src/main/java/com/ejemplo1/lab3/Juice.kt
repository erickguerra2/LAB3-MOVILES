package com.ejemplo1.lab3

class Juice (name: String, price: Double) : Drink(name, price){
    override fun pour(): String {
        return "Servir el jugo en un vaso."
    }
    override fun cook(): String {
        return "Exprimir las naranjas en un recipiente y agregar agua.."
    }
}