package com.example.exonimals

import android.content.Intent
import android.graphics.text.LineBreaker
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*

@Suppress("DEPRECATION")
class DetailActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        tv_detail_description.justificationMode = LineBreaker.JUSTIFICATION_MODE_INTER_WORD
        setActionBarButtonsClickListener()
        loadAnimalData()
    }

    private fun loadAnimalData() {
        val pos = intent.getIntExtra("pos", -1)
        val list = AnimalData.listAnimals
        val animal = list[pos]

        Glide.with(this)
            .load(animal.photo)
            .fitCenter()
            .into(img_detail_photo)

        tv_detail_name.text = animal.name
        tv_detail_description.text = animal.description
        tv_detail_class.text = getString(R.string.class_text, animal.classification)
        tv_detail_latin.text = getString(R.string.latin_name, animal.latinName)
        tv_detail_habitat.text = getString(R.string.habitat, animal.habitat)
        tv_detail_diet.text = getString(R.string.diet, animal.diet)

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