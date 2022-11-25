package com.example.alertdialogbox2511

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = layoutInflater.inflate(R.layout.activity_main2,null)

        var builder = AlertDialog.Builder(this).setTitle("Login?")
            builder.setMessage("Are you sure to Login")
        builder.setCancelable(true)
           builder.setPositiveButton("yes"){
                dialog ,it ->
               var alertDialog = AlertDialog.Builder(this)

               alertDialog.setTitle("Login")
               alertDialog.setMessage("Pathway to Login")
               alertDialog.setView(view)
               var editText = view.findViewById<EditText>(R.id.editTextTextEmailAddress).text.toString()
               var editText2 = view.findViewById<EditText>(R.id.editTextTextPassword).text.toString()
               alertDialog.setPositiveButton("Submit"){
                   dialog,it ->

                   if(editText=="alice@gmail.com" && editText2=="12345")
                       Toast.makeText(this,"Login Successful",Toast.LENGTH_LONG).show()
                   else
                       Toast.makeText(this,"Sorry Invalid Credentials",Toast.LENGTH_SHORT).show()
               }
               alertDialog.create().show()







               }

            builder.setNegativeButton("No"){
          dialog,it -> dialog.dismiss()
            }
        builder.create().show()




    }
}