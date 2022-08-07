package com.example.exonimals

import android.content.Intent
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*

@Suppress("DEPRECATION")
class DetailActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        tv_detail_description.movementMethod = ScrollingMovementMethod()
        setActionBarButtonsClickListener()
        loadAnimalData()
    }

    private fun loadAnimalData() {
        val pos = intent.getIntExtra("pos", -1)
        val list = AnimalData.listAnimals
        val animal = list[pos]

        Picasso.get()
            .load(animal.photo)
            .fit()
            .centerCrop()
            .into(img_detail_animal)

        tv_detail_name.text = animal.name
        tv_detail_latin.text = animal.latinName
        tv_detail_habitat.text = animal.habitat
        tv_detail_diet.text = animal.diet
        tv_detail_description.text = animal.description
    }

    private fun setActionBarButtonsClickListener() {
        btn_about.setOnClickListener {
            Intent(this@DetailActivity, AboutActivity::class.java).also{
                startActivity(it)
            }
        }

        btn_back.setOnClickListener {
            finish()
        }
    }
}