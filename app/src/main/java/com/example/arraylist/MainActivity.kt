package com.example.arraylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name = findViewById<EditText>(R.id.etName)
        var number = findViewById<EditText>(R.id.etNumber)
        var addName = findViewById<Button>(R.id.addButton)
        var displayButton = findViewById<Button>(R.id.displayButton)
        var tv = findViewById<TextView>(R.id.textView)
        var names = arrayListOf<String>()

        addName.setOnClickListener {
            names.add(name.text.toString())
        }
        displayButton.setOnClickListener {
            tv.text = names[(number.text.toString().toInt())-1]
        }
    }
}