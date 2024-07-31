package com.ejemplo1.lab3

class Pizza (name: String, price: Double) : Food(name, price){
    override fun cook(): String {
        return "Hornear la pizza durante 15 minutos a 200 grados."
    }
}