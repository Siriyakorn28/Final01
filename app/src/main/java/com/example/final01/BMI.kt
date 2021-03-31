package com.example.final01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_b_m_i.*
import kotlinx.android.synthetic.main.activity_b_m_i.btncal
import kotlinx.android.synthetic.main.activity_b_m_i.btnclear
import kotlinx.android.synthetic.main.activity_b_m_i.btnhome
import kotlinx.android.synthetic.main.activity_b_m_i.height
import kotlinx.android.synthetic.main.activity_b_m_i.weight
import kotlinx.android.synthetic.main.activity_b_m_r.*

class BMI : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_m_i)

        val text01 = Toast.makeText(applicationContext,"Please enter weight", Toast.LENGTH_LONG)
        val text02 = Toast.makeText(applicationContext,"Please enter height", Toast.LENGTH_LONG)
        val text03 = Toast.makeText(applicationContext,"Complete", Toast.LENGTH_LONG)
        val text04 = Toast.makeText(applicationContext,"Delete complete", Toast.LENGTH_LONG)

        btnclear.setOnClickListener(){
            weight.setText(null)
            height.setText(null)
            result.setText(null)
            text04.show()
        }
        btncal.setOnClickListener(){
            if (this.weight.text.toString() == ""){
                text01.show()
            } else if (this.height.text.toString() == ""){
                text02.show()
            }else{
                text03.show()
                val h = (height.text).toString().toFloat() / 100;
                val w = weight.text.toString().toFloat()
                val bmi = w / (h * h)
                result.text = "%.2f".format(bmi)
            }
        }
        btnhome.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}