package com.example.exonimals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var list = AnimalData.listAnimals
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_animals.setHasFixedSize(true)
        showListAnimal()

        btn_about_main.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }
    }

    private fun showListAnimal() {
        val listAnimalAdapter = ListAnimalAdapter(list)
        rv_animals.layoutManager = LinearLayoutManager(this)
        rv_animals.adapter = listAnimalAdapter
    }
}