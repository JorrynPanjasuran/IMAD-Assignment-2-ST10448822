package com.jorryn.tamagotchidraftfour

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    private lateinit var petImageView: ImageView
    private lateinit var healthProgressBar: ProgressBar
    private lateinit var hungerProgressBar: ProgressBar
    private lateinit var cleanlinessProgressBar: ProgressBar
    private lateinit var healthTextView: TextView
    private lateinit var hungerTextView: TextView
    private lateinit var cleanlinessTextView: TextView
    private lateinit var statusAlertTextView: TextView

    private var health = 0
    private var hunger = 0
    private var cleanliness = 0

    private val handler = Handler()
    private val decrementStatusTask = object : Runnable {
        override fun run() {
            // Decrease pet's status values by 10 every 30 seconds
            hunger -= 10
            cleanliness -= 10
            health -= 10

            // Ensure status values stay within 0-100 range
            hunger = hunger.coerceIn(0, 100)
            cleanliness = cleanliness.coerceIn(0, 100)
            health = health.coerceIn(0, 100)

            // Update progress bars and text views
            updateProgressBars()

            // Check status and display alert if below 40
            checkStatusAlert()

            // repeats thee task every 30 sec
            handler.postDelayed(this, 30000)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Initializations
        petImageView = findViewById(R.id.petImageView)
        healthProgressBar = findViewById(R.id.healthProgressBar)
        hungerProgressBar = findViewById(R.id.hungerProgressBar)
        cleanlinessProgressBar = findViewById(R.id.cleanlinessProgressBar)
        healthTextView = findViewById(R.id.healthTextView)
        hungerTextView = findViewById(R.id.hungerTextView)
        cleanlinessTextView = findViewById(R.id.cleanlinessTextView)
        statusAlertTextView = findViewById(R.id.statusAlertTextView)


        findViewById<Button>(R.id.feedButton).setOnClickListener {
            // Update pet status on feed
            petImageView.setBackgroundResource(R.drawable.corgieat)
            updatePetStatus("feed")
        }
        findViewById<Button>(R.id.cleanButton).setOnClickListener {
            // Update the pets status on clean bttn
            petImageView.setBackgroundResource(R.drawable.corgibath)
            updatePetStatus("clean")
        }
        findViewById<Button>(R.id.playButton).setOnClickListener {
            // Update pet status on play button
            petImageView.setBackgroundResource(R.drawable.corgiplay)
            updatePetStatus("play")
        }
        findViewById<Button>(R.id.backButton).setOnClickListener {
            // Takes you back to Activity 1 aka the Welcomescreen
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun updatePetStatus(action: String) {
        // Reset progress bars to 0 when bttn are clicked
        if (health == 0 && hunger == 0 && cleanliness == 0) {
            health = 0
            hunger = 0
            cleanliness = 0
            updateProgressBars()
        }

        when (action) {
            "feed" -> {
                hunger += 5
                hunger = hunger.coerceIn(0, 100)
            }
            "clean" -> {
                cleanliness += 5
                cleanliness = cleanliness.coerceIn(0, 100)
            }
            "play" -> {
                health += 5
                health = health.coerceIn(0, 100)
            }
        }
        // Updates the progress bars and text views
        updateProgressBars()
    }

    private fun updateProgressBars() {
        // Update progress bars based on current values
        healthProgressBar.progress = health
        hungerProgressBar.progress = hunger
        cleanlinessProgressBar.progress = cleanliness

        // Update text views with % numbers
        healthTextView.text = "$health%"
        hungerTextView.text = "$hunger%"
        cleanlinessTextView.text = "$cleanliness%"
    }

    private fun checkStatusAlert() {
        if (health < 40 || hunger < 40 || cleanliness < 40) {
            statusAlertTextView.text = "Check your Pet's health, happiness, and cleanliness!"
        } else {
            statusAlertTextView.text = ""
        }
    }

    override fun onResume() {
        super.onResume()
        // Start the task to decrement status every 30 seconds
        handler.postDelayed(decrementStatusTask, 30000)
    }

    override fun onPause() {
        super.onPause()
        // Stop the task when activity is paused to avoid memory leaks
        handler.removeCallbacks(decrementStatusTask)
    }
}
