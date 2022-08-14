package com.example.exonimals

import android.content.Intent
import android.graphics.text.LineBreaker
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*

@Suppress("DEPRECATION")
class DetailActivity: AppCompatActivity() {
    private var pos: Int = -1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        pos = intent.getIntExtra("pos", -1)
        tv_detail_description.justificationMode = LineBreaker.JUSTIFICATION_MODE_INTER_WORD
        chip_favorite.chipBackgroundColor = getColorStateList(R.color.chip_color)
        chip_favorite.setTextColor(getColorStateList(R.color.chip_text_color))
        setActionBarButtonsClickListener()
        loadAnimalData()
        setChipOnCheckedChangeListener()
    }

    private fun setChipOnCheckedChangeListener() {
        chip_favorite.setOnCheckedChangeListener{ _, isChecked ->
            MainActivity.listAnimal[pos].isFavorite = isChecked
            val name = MainActivity.listAnimal[pos].name
            val favCheck = MainActivity.listAnimal[pos].isFavorite

            Toast.makeText(this, "$name's isFavorite: $favCheck \n Chip's: $isChecked", Toast.LENGTH_LONG).show()
        }
    }

    private fun loadAnimalData() {
        val list = AnimalData.listAnimals
        val animal = list[pos]

        Glide.with(this)
            .load(animal.photo)
            .fitCenter()
            .into(img_detail_photo)

        chip_favorite.isChecked = MainActivity.listAnimal[pos].isFavorite
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