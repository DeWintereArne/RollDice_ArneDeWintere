package com.example.myapplication2

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var rollButton: Button
    private lateinit var deletethedice: Button
    private lateinit var rollAll4: Button
    private lateinit var diceImageview: ImageView
    private lateinit var diceImageview2: ImageView
    private lateinit var diceImageview3: ImageView
    private lateinit var diceImageview4: ImageView
    private var toasties: Array<String> = arrayOf(
        "you forgot to blow on it",
        "May the odds be ever in your favor"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        this.rollButton = findViewById(R.id.btnrolldice)
        this.rollAll4 = findViewById(R.id.btnRollall4dice)
        this.deletethedice = findViewById(R.id.btnDeletedice)

        this.diceImageview = findViewById(R.id.imgdices)
        this.diceImageview2 = findViewById(R.id.imgdices2)
        this.diceImageview3 = findViewById(R.id.imgdices3)
        this.diceImageview4 = findViewById(R.id.imgdices4)

    }

    override fun onStart() {
        super.onStart()

        this.rollButton.setOnClickListener {
            //var iToasty = Random.nextInt(this.toasties.size)
            //Toast.makeText(this, this.toasties[iToasty], Toast.LENGTH_SHORT).show()
            val iToasty = Random.nextInt(resources.getStringArray(R.array.diceToasts).size)
            Toast.makeText(
                this,
                resources.getStringArray(R.array.diceToasts)[iToasty],
                Toast.LENGTH_SHORT
            ).show()
            rollDice()
        }

        this.rollAll4.setOnClickListener {
            rollAlldice()
        }

        this.deletethedice.setOnClickListener{
            deletethedice()
        }
    }

    private fun rollDice() {
        //var dice = Random.nextInt(6) +1
        var result = when (Random.nextInt(6) + 1) {
            // case 0: ...
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        this.diceImageview.setImageResource(result)
    }

    private fun rollAlldice() {
        var result1 = when (Random.nextInt(6) + 1) {
            // case 0: ...
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        var result2 = when (Random.nextInt(6) + 1) {
            // case 0: ...
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        var result3 = when (Random.nextInt(6) + 1) {
            // case 0: ...
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        var result4 = when (Random.nextInt(6) + 1) {
            // case 0: ...
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        this.diceImageview.setImageResource(result1)
        this.diceImageview2.setImageResource(result2)
        this.diceImageview3.setImageResource(result3)
        this.diceImageview4.setImageResource(result4)
    }

    private fun deletethedice(){
        var result = R.drawable.empty_dice

        this.diceImageview.setImageResource(result)
        this.diceImageview2.setImageResource(result)
        this.diceImageview3.setImageResource(result)
        this.diceImageview4.setImageResource(result)
    }
}