package com.example.multiplierapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // Declaring variables
    val editNum1 = findViewById<EditText>(R.id.editNum1)
    val editNum2 = findViewById<EditText>(R.id.editNum2)
    val btnCalc = findViewById<Button>(R.id.btnCalc)
    val txtResult = findViewById<TextView>(R.id.txtResult)

    // function to multiply
    fun multiply () {
        val editNum1 = editNum1.text.toString().toInt()
        val editNum2 = editNum2.text.toString().toInt()
        val btnCalc = editNum1 * editNum2
        val txtResult = txtResult.text
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // function
        btnCalc.setOnClickListener {

        }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}