package com.example.voicecalories.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.voicecalories.R
import com.example.voicecalories.domain.usecases.nutrition.ChooseDietUseCase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val database = Firebase.database
        val myRef = database.getReference("message")

        myRef.setValue("Hello, World!")


        val diet = ChooseDietUseCase()
        diet.chooseDiet()
    }
}