package com.example.bootcampcompenionapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class QuestsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quests)

        // Buttons initialisieren
        val buttonMonoWhite: Button = findViewById(R.id.buttonMonoWhite)
        val buttonMonoBlue: Button = findViewById(R.id.buttonMonoBlue)
        val buttonMonoBlack: Button = findViewById(R.id.buttonMonoBlack)
        val buttonMonoGreen: Button = findViewById(R.id.buttonMonoGreen)
        val buttonMonoRed: Button = findViewById(R.id.buttonMonoRed)
        val buttonBack: Button = findViewById(R.id.buttonBack)

        // OnClickListener für Mono White
        buttonMonoWhite.setOnClickListener {
            val intent = Intent(this, MonoWhiteActivity::class.java)
            startActivity(intent)
        }

        // OnClickListener für Mono Blue
        buttonMonoBlue.setOnClickListener {
            val intent = Intent(this, MonoBlueActivity::class.java)
            startActivity(intent)
        }

        // OnClickListener für Mono Black
        buttonMonoBlack.setOnClickListener {
            val intent = Intent(this, MonoBlackActivity::class.java)
            startActivity(intent)
        }

        // OnClickListener für Mono Green
        buttonMonoGreen.setOnClickListener {
            val intent = Intent(this, MonoGreenActivity::class.java)
            startActivity(intent)
        }

        // OnClickListener für Mono Red
        buttonMonoRed.setOnClickListener {
            val intent = Intent(this, MonoRedActivity::class.java)
            startActivity(intent)
        }

        // OnClickListener für Zurück-Button
        buttonBack.setOnClickListener {
            finish() // Schließt die aktuelle Activity und kehrt zur vorherigen zurück
        }
    }
}
