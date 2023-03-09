package com.example.fivescoreapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvScore: TextView = findViewById(R.id.tvScore)
        val btnMinus: Button = findViewById(R.id.btnMinus)
        val btnPlus: Button = findViewById(R.id.btnPlus)
        var num = 0

        //+1ボタンでスコアを増やす
        btnPlus.setOnClickListener {
            num++

            //5になったらClear
            if (num == 5) {
                val intent = Intent(this, GameClear::class.java)
                startActivity(intent)
                finish()
            } else {
                tvScore.text = num.toString()
            }
        }

        //-1ボタンでスコアを減らす
        btnMinus.setOnClickListener {
            num--

            //-5になったらGameOver
            if (num == -5) {
                val intent = Intent(this, GameOver::class.java)
                startActivity(intent)
                finish()
            } else {
                tvScore.text = num.toString()
            }
        }
    }
}

