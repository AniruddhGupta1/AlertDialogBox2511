package com.example.alertdialogbox2511

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var editText:EditText=findViewById(R.id.editTextTextEmailAddress)
        var editText2:EditText=findViewById(R.id.editTextTextPassword)

    }
}