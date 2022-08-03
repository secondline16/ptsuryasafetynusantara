package com.example.ta_ver1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MenuRegister : AppCompatActivity(), View.OnClickListener {

    private lateinit var textview : TextView
    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_register)
        textview = findViewById(R.id.login)
        textview.setOnClickListener(this)

        button = findViewById(R.id.button_register)
        button.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.login ->{
                val pindahlogin = Intent(this, MenuLogin::class.java)
                startActivity(pindahlogin)
            }
        }
        when(v.id){
            R.id.button_register ->{
                val login = Intent(this, MenuLogin::class.java)
                startActivity(login)
            }
        }
    }

}