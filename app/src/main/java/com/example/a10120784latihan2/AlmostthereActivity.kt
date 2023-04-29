package com.example.a10120784latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class AlmostthereActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btn_verify : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almostthere)

        btn_verify = findViewById(R.id.btn_verify)

        btn_verify.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btn_verify ->{
                val intent = Intent(this@AlmostthereActivity, VerifyaccActivity::class.java)
                startActivity(intent)
            }
        }
    }
}