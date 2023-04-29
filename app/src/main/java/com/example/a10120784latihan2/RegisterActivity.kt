package com.example.a10120784latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnregis : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnregis = findViewById(R.id.btnregis)

        btnregis.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btnregis ->{
                val intent = Intent(this@RegisterActivity, AlmostthereActivity::class.java)
                startActivity(intent)
            }
        }
    }
}