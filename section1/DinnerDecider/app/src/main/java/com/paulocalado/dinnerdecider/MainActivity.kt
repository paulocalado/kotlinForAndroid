package com.paulocalado.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Mcdonalds", "Burguer King", "Taco Bell", "Pizza")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val randomFood = java.util.Random().nextInt(foodList.count())
            selectedFoodTest.text = foodList[randomFood]
        }

        addBtn.setOnClickListener {
            val newFood = edtAddFood.text.toString()
            foodList.add(newFood)
            edtAddFood.text.clear()
            print(foodList)
        }
    }
}
