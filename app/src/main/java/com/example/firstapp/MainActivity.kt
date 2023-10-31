package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i( "MYTAG", "Started My Main Activity")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val submmitButton = findViewById<Button>(R.id.btSubmit)

        val name = findViewById<EditText>(R.id.etName)
        val nameString = name.text.toString()
        val greetingView = findViewById<TextView>(R.id.textView)
        submmitButton.setOnClickListener {
            Log.i( "MYTAG", "submitButton is clicked")
            if(name.text.toString().isEmpty())
                Toast.makeText(this, "name is empty, please input your name!", Toast.LENGTH_SHORT).show()
            else {
                greetingView.text = "Hello ${name.text.toString()}"
                name.setText("")
            }
        }
    }
}