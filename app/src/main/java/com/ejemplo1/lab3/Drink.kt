package com.ejemplo1.lab3

abstract class Drink (name: String, price: Double) : Food(name, price){
    abstract fun pour(): String
}