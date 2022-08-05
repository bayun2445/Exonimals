package com.example.exonimals

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        btn_about.setOnClickListener {
            val intent = Intent(this@DetailActivity, AboutActivity::class.java)
            startActivity(intent)
        }

        btn_back.setOnClickListener {
            finish()
        }
    }
}