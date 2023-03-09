package com.example.voicecalories.domain.usecases.nutrition

class CounterCaloriesUseCase {
    private var calories = 1000

    fun caloriesSum(): Int {
        return calories
    }
}