package com.example.voicecalories.domain.usecases.nutrition

import android.util.Log
import com.example.voicecalories.domain.usecases.nutrition.models.Diet

class ChooseDietUseCase {

    fun chooseDiet(): Diet {
        val diet: Diet = Diet("keto", 30,20, 50)

        return diet
    }

    fun getTotalCalories(diet: Diet): Int {
        val totalCalories = diet.protein * 4 + diet.fats * 9 + diet.carbs * 4
        return totalCalories

        Log.e("total", totalCalories.toString())
    }
}