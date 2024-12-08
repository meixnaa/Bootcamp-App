package com.example.bootcampcompenionapp

import android.os.Bundle
import android.util.Log
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MonoWhiteActivity : AppCompatActivity() {
    private var counter = 0
    private lateinit var counterTextView: TextView
    private lateinit var resolvedTextView: TextView
    private lateinit var imageView: ImageView
    private lateinit var fireworkImageView: ImageView // Feuerwerks-ImageView hinzufügen

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mono_white)

        val buttonBack: Button = findViewById(R.id.buttonBack)
        counterTextView = findViewById(R.id.counterTextView)
        resolvedTextView = findViewById(R.id.resolvedTextView)
        imageView = findViewById(R.id.imageView)
        fireworkImageView = findViewById(R.id.fireworkImageView)

        // Initialisiere die Feuerwerk-ImageView
        fireworkImageView = ImageView(this).apply {
            setImageResource(R.anim.firework_animation) // Setze die Feuerwerk-ImageView auf die drawable Ressource
            layoutParams = LinearLayout.LayoutParams(200, 200) // Größe des Bildes anpassen
            visibility = ImageView.GONE // Standardmäßig unsichtbar
        }

        // Füge die Feuerwerk-ImageView zum Hauptlayout hinzu
        val mainLayout: LinearLayout = findViewById(R.id.mainLayout) // Stelle sicher, dass das Layout eine ID hat
        mainLayout.addView(fireworkImageView)

        buttonBack.setOnClickListener {
            finish() // Schließt die aktuelle Activity und kehrt zur vorherigen zurück
        }

        // Zähler erhöhen beim Klicken auf das Bild
        imageView.setOnClickListener {
            // Zähler anzeigen, wenn er noch nicht sichtbar ist
            if (counter == 0) {
                counterTextView.visibility = TextView.VISIBLE
            }

            if (counter < 7) {
                counter++
                counterTextView.text = counter.toString()
            }

            // Wenn der Zähler 7 erreicht, zeige das Feuerwerk
            if (counter == 7) {
                resolvedTextView.visibility = TextView.VISIBLE
                counterTextView.setBackgroundResource(R.drawable.rounded_counter_background)
                counterTextView.setBackgroundColor(getColor(android.R.color.holo_orange_dark))// Hintergrund orange
                showFireworkAnimation() // Feuerwerksanimation anzeigen
            }
        }

        // Zähler zurücksetzen beim Drücken und Halten des Bildes
        imageView.setOnLongClickListener {
            counter = 0
            counterTextView.text = counter.toString()
            counterTextView.visibility = TextView.GONE // Zähler wird unsichtbar
            resolvedTextView.visibility = TextView.GONE // "Resolved!" wird unsichtbar
            counterTextView.setBackgroundColor(getColor(android.R.color.black))
            counterTextView.setBackgroundResource(R.drawable.rounded_counter_background)// Hintergrund schwarz
            fireworkImageView.visibility = ImageView.GONE // Feuerwerk wird unsichtbar
            true // zeigt an, dass das Long-Click-Event verarbeitet wurde
        }
    }

    private fun showFireworkAnimation() {
        fireworkImageView.visibility = ImageView.VISIBLE // Feuerwerk sichtbar machen
        Log.d("MonoWhiteActivity", "Feuerwerk sichtbar!")
        fireworkImageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.firework_animation)) // Animation starten

        // Nach der Animation, kannst du das Feuerwerk wieder unsichtbar machen
        fireworkImageView.postDelayed({
            fireworkImageView.visibility = ImageView.GONE
            Log.d("MonoWhiteActivity", "Feuerwerk unsichtbar!")
        }, 2000) // Unsichtbar nach 600ms
    }
}
