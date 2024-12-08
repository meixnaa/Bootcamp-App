package com.example.bootcampcompenionapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MonoRedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mono_red) // Hier musst du dein Layout für MonoRedActivity erstellen

        val buttonBack: Button = findViewById(R.id.buttonBack)
        buttonBack.setOnClickListener {
            finish() // Schließt die aktuelle Activity und kehrt zur vorherigen zurück
        }
    }
}
