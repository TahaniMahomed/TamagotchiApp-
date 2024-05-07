package com.example.tamagotchiapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {



        private lateinit var PetImageView: ImageView

        private var health = 100
        private var cleanliness = 50
        private var happy= 50


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main2)
            setupGameScreen()
        }


        private fun setupGameScreen() {
            PetImageView = findViewById(R.id.ImageView)
            val feedButton: Button = findViewById(R.id.feedButton)
            val cleanButton: Button = findViewById(R.id.cleanButton)
            val playButton: Button = findViewById(R.id.playButton)

            feedButton.setOnClickListener {
                PetImageView.setImageResource(R.drawable.feed)
                updatePetStatus("feed")
            }

            cleanButton.setOnClickListener {
                PetImageView.setImageResource(R.drawable.clean)
                updatePetStatus("bath")
            }

            playButton.setOnClickListener {
                PetImageView.setImageResource(R.drawable.play)
                updatePetStatus("play")
            }
        }

        private fun updatePetStatus(action: String) {
            when (action) {
                "feed" -> {
                    health +=20
                    if (health > 100) health = 100
                }
                "bath" -> {
                    cleanliness += 20
                    if (cleanliness > 100) cleanliness = 100
                }
                "play" -> {
                    health += 20
                    if (health > 100) health = 100
                }
            }
            //upate progress bars
            updateProgressBars()
        }

        private fun updateProgressBars() {
            //Update progress bars based on current values
        }
    }





