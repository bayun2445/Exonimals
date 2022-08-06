package com.example.exonimals

import android.content.Intent
import android.os.Bundle
import android.util.DisplayMetrics
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail.*

@Suppress("DEPRECATION")
class DetailActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        setActionBarButtonsClickListener()
        loadAnimalData()
    }

    private fun loadAnimalData() {
        val pos = intent.getIntExtra("pos", -1)
        val list = AnimalData.listAnimals
        val animal = list[pos]

        Glide.with(this)
            .load(animal.photo)
            .apply(RequestOptions().override(getScreenWidth(),300))
            .into(img_detail_animal)

        tv_detail_name.text = animal.name
        tv_detail_latin.text = animal.latinName
        tv_detail_habitat.text = animal.habitat
        tv_detail_diet.text = animal.diet
        tv_detail_description.text = animal.description
    }

    private fun getScreenWidth(): Int {
        val displayMetrics = DisplayMetrics()
        this.windowManager.defaultDisplay.getMetrics(displayMetrics)
        return displayMetrics.widthPixels
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