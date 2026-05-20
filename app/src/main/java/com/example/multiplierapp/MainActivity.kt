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
var editNum1 = findViewById<EditText>(R.id.editNum1)
    var editNum2 = findViewById<EditText>(R.id.editNum2)
    var btnCalc = findViewById<Button>(R.id.btnCalc)
    var txtResult = findViewById<TextView>(R.id.txtResult)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        // function
        btnCalc.setOnClickListener {
            editNum1 = editNum1.text as EditText?
            editNum2 = editNum2.text as EditText?
            btnCalc = btnCalc
            txtResult = txtResult
        }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}