package com.ejemplo1.lab3

class Burger (name: String, price: Double) : Food(name, price){
    override fun cook(): String {
        return "Asar la tortita de la hamburguesa durante 4 minutos por lado."
    }
}