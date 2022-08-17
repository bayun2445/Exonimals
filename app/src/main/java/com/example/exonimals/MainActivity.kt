package com.example.exonimals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        lateinit var listAnimal: ArrayList<Animal>
        lateinit var listAnimalAdapter: ListAnimalAdapter
        lateinit var favListAnimal: ArrayList<Animal>
        lateinit var favListAnimalAdapter: ListAnimalAdapter
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

    override fun onBackPressed() {
        AlertDialog.Builder(this).also{
            it.setTitle(getString(R.string.exit_title))
                .setMessage(R.string.exit_message)
                .setPositiveButton(getString(R.string.exit_positive)) { _, _ ->
                    saveFavoriteState()
                    finish()
                }
                .setNegativeButton(getString(R.string.exit_negative)){ dialog, _ ->
                    dialog.cancel()
                }
                .create()
                .show()
        }
    }

    private fun saveFavoriteState() {
        val arrayFavorite = BooleanArray(listAnimal.size)

        for (pos in 0..listAnimal.lastIndex) {
            arrayFavorite[pos] = listAnimal[pos].isFavorite
        }

        val json: String = Gson().toJson(arrayFavorite)

        getSharedPreferences("shared preferences", MODE_PRIVATE)
            .edit()
            .putString("favorites", json)
            .apply()
    }

    private fun loadListAnimal() {
        listAnimal = AnimalData.listAnimals

        val savedFavorite = getSharedPreferences("shared preferences", MODE_PRIVATE)
        val json = savedFavorite.getString("favorites", null)

        if(json != null){
            if (json.isNotEmpty()){
                val type = object : TypeToken<Array<Boolean>>(){}.type
                val arrayFavorite: Array<Boolean> = Gson().fromJson(json, type)

                for (pos in 0..listAnimal.lastIndex) {
                    listAnimal[pos].isFavorite = arrayFavorite[pos]
                }
            }
        }

        listAnimalAdapter = ListAnimalAdapter(listAnimal)
        rv_animals.layoutManager = LinearLayoutManager(this)
        rv_animals.adapter = listAnimalAdapter
    }

    private fun loadFavListAnimal() {
        favListAnimal = ArrayList()
        for (animal in listAnimal){
            if (animal.isFavorite)
                favListAnimal.add(animal)
        }

        favListAnimalAdapter = ListAnimalAdapter(favListAnimal)
        rv_animals_favorite.layoutManager = LinearLayoutManager(this)
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
                    startActivity(it)
                }
            }
        })

        favListAnimalAdapter.setClicked(object: ListAnimalAdapter.ItemClicked {
            override fun click(position: Int) {
                Intent(this@MainActivity, DetailActivity::class.java).also{
                    val favPosition = listAnimal.indexOf(favListAnimal[position])
                    it.putExtra("pos", favPosition)
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
}