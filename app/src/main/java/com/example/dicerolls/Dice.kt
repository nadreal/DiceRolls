package com.example.dicerolls

class Dice (val sideNumber: Int) {

    fun roll(): Int {
        return (1..sideNumber).random()
    }
}