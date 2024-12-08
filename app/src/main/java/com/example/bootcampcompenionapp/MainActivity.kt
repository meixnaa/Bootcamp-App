package com.example.bootcampcompenionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Buttons initialisieren und mit OnClickListener versehen
        val buttonZeitplan: Button = findViewById(R.id.buttonZeitplan)
        val buttonQuests: Button = findViewById(R.id.buttonQuests)
        val buttonPricewall: Button = findViewById(R.id.buttonPricewall)
        val buttonAuswertung: Button = findViewById(R.id.buttonAuswertung)
        val appNameTextView: TextView = findViewById(R.id.appName)
        appNameTextView.text = "Bootcamp Companion App"

        // Button-Klicks
        buttonZeitplan.setOnClickListener {
            val intent = Intent(this, ZeitplanActivity::class.java) // Ersetze ZeitplanActivity durch deine tatsächliche Klasse
            startActivity(intent)
        }

        // OnClickListener für den Quests-Button
        buttonQuests.setOnClickListener {
            val intent = Intent(this, QuestsActivity::class.java)
            startActivity(intent)
        }

        // OnClickListener für den Pricewall-Button
        buttonPricewall.setOnClickListener {
            val intent = Intent(this, PricewallActivity::class.java)
            startActivity(intent)
        }

        // OnClickListener für den Auswertung-Button
        buttonAuswertung.setOnClickListener {
            val intent = Intent(this, AuswertungActivity::class.java) // Ersetze AuswertungActivity durch deine tatsächliche Klasse
            startActivity(intent)
        }
    }
}
