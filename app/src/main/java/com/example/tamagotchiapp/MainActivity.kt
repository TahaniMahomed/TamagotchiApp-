package com.example.tamagotchiapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {



        //declare variables
        //the keyword lateinit allows us to initialize a variable at a later stage
        private lateinit var startButton: Button


        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState:  Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            //making use of the find view by ID method
            //initializing the variable by getting reference to the button
            //get reference by using the ID name


            startButton = findViewById(R.id.startButton)
            startButton.setOnClickListener{

                //create variable
                var Intent= Intent(this,MainActivity2::class.java)
                startActivity(Intent)
            }
        }
    }


