package com.example.exonimals

import android.content.Intent
import android.graphics.text.LineBreaker
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*
import com.example.exonimals.MainActivity.Companion as main

@Suppress("DEPRECATION")
class DetailActivity: AppCompatActivity() {
    private lateinit var animal: Animal
    private var pos  = -1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        tv_detail_description.justificationMode = LineBreaker.JUSTIFICATION_MODE_INTER_WORD
        setActionBarButtonsClickListener()
        loadAnimalData()
        setChipOnCheckedChangeListener()
    }

    private fun loadAnimalData() {
        pos = intent.getIntExtra("pos", -1)
        animal = main.listAnimal[pos]

        Glide.with(this)
            .load(animal.photo)
            .fitCenter()
            .into(img_detail_photo)

        chip_favorite.isChecked = animal.isFavorite
        tv_detail_name.text = animal.name
        tv_detail_description.text = animal.description
        tv_detail_class.text = getString(R.string.class_text, animal.classification)
        tv_detail_latin.text = getString(R.string.latin_name, animal.latinName)
        tv_detail_habitat.text = getString(R.string.habitat, animal.habitat)
        tv_detail_diet.text = getString(R.string.diet, animal.diet)

    }

    private fun setChipOnCheckedChangeListener() {
        chip_favorite.setOnCheckedChangeListener{ _, isChecked ->
            main.listAnimal[pos].isFavorite = isChecked
            val animal = main.listAnimal[pos]
            val name = main.listAnimal[pos].name

            if (isChecked) {
                main.favListAnimal.add(animal)
                main.favListAnimalAdapter.notifyItemInserted(main.favListAnimal.lastIndex)
                Toast.makeText(this, "$name added to Favorite", Toast.LENGTH_SHORT)
                    .show()
            }
            else {
                val animalFavoriteIndex = main.favListAnimal.indexOf(animal)
                main.favListAnimal.removeAt(animalFavoriteIndex)
                main.favListAnimalAdapter.notifyItemRemoved(animalFavoriteIndex)
                Toast.makeText(this, "$name removed from Favorite", Toast.LENGTH_SHORT)
                    .show()
            }
        }
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