package com.example.dicerollactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {


lateinit var dice1Image: ImageView
lateinit var dice2image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         dice1Image = findViewById(R.id.dice1)
         dice2image = findViewById(R.id.dice2)
        val roll = findViewById<Button>(R.id.Roll)


        roll.setOnClickListener {
            rollDice()
            roll.text = "Roll Again"
        }
        }
    private fun rollDice() {
        val dice = Dice (6)
        val diceRoll = dice.roll()

        val drawableDice = when(diceRoll){
            1 -> R.drawable.img_1
            2 -> R.drawable.img
            3 -> R.drawable.img_3
            4 -> R.drawable.img_4
            5 -> R.drawable.img_5
            else -> R.drawable.img_2
        }
        dice1Image.setImageResource(drawableDice)


        val dice2 = Dice (6)
        val diceRoll2 = dice2.roll()

        val drawableDice1 = when(diceRoll2){
            1 -> R.drawable.img_1
            2 -> R.drawable.img
            3 -> R.drawable.img_3
            4 -> R.drawable.img_4
            5 -> R.drawable.img_5
            else -> R.drawable.img_2
        }
        dice2image.setImageResource(drawableDice1)
    }
}