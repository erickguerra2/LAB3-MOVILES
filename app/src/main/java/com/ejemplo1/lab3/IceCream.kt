package com.ejemplo1.lab3

class IceCream (name: String, price: Double) : Food(name, price), Dessert {
    override fun cook(): String {
        return "Enfriar el helado durante 1 hora."
    }

    override fun eat(): String {
        return "El helado está listo para comer."
    }
}