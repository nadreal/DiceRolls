package com.example.dicerolls

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.dicerolls.R.id
import com.example.dicerolls.R.layout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val rollButton: Button = findViewById(id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val diceImage: ImageView = findViewById(id.imageView_dice)
        val myDice = Dice(5)
        val diceRoll = myDice.roll()

        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceRoll.toString()
    }


}