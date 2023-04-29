package com.example.a10120784latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class VerifyaccActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btn_send : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verifyacc)

        btn_send = findViewById(R.id.btn_send)

        btn_send.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btn_send ->{
                val intent = Intent(this@VerifyaccActivity, UserhomeActivity::class.java)
                startActivity(intent)
            }
        }
    }
}