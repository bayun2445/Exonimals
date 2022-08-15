package com.example.exonimals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        var listAnimal = AnimalData.listAnimals
        val listAnimalAdapter = ListAnimalAdapter(listAnimal)
        lateinit var favListAnimal: ArrayList<Animal>
        lateinit var favListAnimalAdapter: ListAnimalAdapter
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_animals.setHasFixedSize(true)
        rv_animals_favorite.setHasFixedSize(false)
        favListAnimal = ArrayList()
        loadListAnimal()
        loadFavListAnimal()
        setShowChipCheckedChangeListener()
        setActionBarOnClickListener()
        setListAdapterOnClickedListener()
    }

    override fun onResume() {
        super.onResume()
        checkFavoriteExistence()
    }

    private fun loadFavListAnimal() {
        for (animal in listAnimal){
            if (animal.isFavorite)
                favListAnimal.add(animal)
        }

        rv_animals_favorite.layoutManager = LinearLayoutManager(this)
        favListAnimalAdapter = ListAnimalAdapter(favListAnimal)
        rv_animals_favorite.adapter = favListAnimalAdapter

        checkFavoriteExistence()
    }

    private fun checkFavoriteExistence() {
        if (favListAnimal.isNotEmpty()){
            tv_no_favorite.visibility = GONE
            rv_animals_favorite.visibility = VISIBLE
        } else {
            tv_no_favorite.visibility = VISIBLE
            rv_animals_favorite.visibility = GONE
        }
    }

    private fun setShowChipCheckedChangeListener() {
        chip_show_favorite.setOnCheckedChangeListener { chip, isChecked ->
            if (isChecked){
                chip.text = getString(R.string.hide)
                container_favorite.visibility = VISIBLE
                checkFavoriteExistence()
            } else {
                chip.text = getString(R.string.show)
                container_favorite.visibility = GONE
                checkFavoriteExistence()
            }
        }
    }

    private fun setListAdapterOnClickedListener() {
        listAnimalAdapter.setClicked(object: ListAnimalAdapter.ItemClicked {
            override fun click(position: Int) {
                Intent(this@MainActivity, DetailActivity::class.java).also{
                    it.putExtra("pos", position)
                    it.putExtra("favorite", false)
                    startActivity(it)
                }
            }
        })

        favListAnimalAdapter.setClicked(object: ListAnimalAdapter.ItemClicked {
            override fun click(position: Int) {
                Intent(this@MainActivity, DetailActivity::class.java).also{
                    it.putExtra("pos", position)
                    it.putExtra("favorite", true)
                    startActivity(it)
                }
            }
        })
    }

    private fun setActionBarOnClickListener() {
        btn_about_main.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }
    }

    private fun loadListAnimal() {
        rv_animals.layoutManager = LinearLayoutManager(this)
        rv_animals.adapter = listAnimalAdapter
    }
}