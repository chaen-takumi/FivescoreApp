package com.example.fivescoreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GameClear : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_clear)

        val btnReplay:Button=findViewById(R.id.btnReplay)

        btnReplay.setOnClickListener {
            finish()
        }
    }
}