package com.example.ta_ver1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MenuLogin : AppCompatActivity(), View.OnClickListener {

    private lateinit var textview : TextView
    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_login)

        textview = findViewById(R.id.buat_akun)
        textview.setOnClickListener(this)

        button = findViewById(R.id.button_login)
        button.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.buat_akun ->{
                val pindahregister = Intent(this, MenuRegister::class.java)
                startActivity(pindahregister)
            }
        }
        when(v.id){
            R.id.button_login ->{
                val pindahmenuutama = Intent(this@MenuLogin, MainMenu::class.java)
                startActivity(pindahmenuutama)
            }
        }
    }
}