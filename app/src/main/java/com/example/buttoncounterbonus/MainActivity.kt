package com.example.buttoncounterbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvNumber:TextView
    lateinit var btSub1:Button
    lateinit var btAdd1:Button
    var number=1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvNumber=findViewById(R.id.tvNumber)
        btSub1=findViewById(R.id.btSub1)
        btAdd1=findViewById(R.id.btAdd1)


        btSub1.setOnClickListener {
            tvNumber.setText((tvNumber.text.toString().toInt() -number).toString())
        }
        btAdd1.setOnClickListener {
            tvNumber.setText((tvNumber.text.toString().toInt() +number).toString())
        }
    }
}