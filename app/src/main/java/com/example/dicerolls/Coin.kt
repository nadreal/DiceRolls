package com.example.dicerolls

class Coin (val color: String) {

    fun toss(): String {
        val coinSides = arrayOf("Head", "Letter")
        return coinSides.random()
    }
}