package tech.sonalbera.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button=findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }
        diceImage=findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        val randomInt = Random.nextInt(6)+1
        val drawableImage= when(randomInt){
            1 -> R.drawable.dice_1

            2 -> R.drawable.dice_2

            3-> R.drawable.dice_3

            4 -> R.drawable.dice_4

            5 -> R.drawable.dice_5

            else -> R.drawable.dice_6

        }
        diceImage.setImageResource(drawableImage)
        var a:Int=0
        when(randomInt){
            1 -> a=1

            2 -> a=2

            3-> a=3

            4 -> a=4

            5 -> a=5

            else -> a=6

        }
        Toast.makeText(this, "Great!! You landed a $a ", Toast.LENGTH_SHORT).show()

    }


}

