package com.example.final01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBMI.setOnClickListener{
            startActivity(Intent(this,BMI::class.java))
        }
        btnBMR.setOnClickListener{
            startActivity(Intent(this,BMR::class.java))
        }
        btnTDEE.setOnClickListener{
            startActivity(Intent(this,TDEE::class.java))
        }
    }
}