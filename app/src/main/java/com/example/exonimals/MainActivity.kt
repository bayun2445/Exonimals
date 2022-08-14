package com.example.exonimals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        var listAnimal = AnimalData.listAnimals
        val listAnimalAdapter = ListAnimalAdapter(listAnimal)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_animals.setHasFixedSize(true)
        showListAnimal()
        setButtonBackOnClickListener()
        setListAdapterOnClickedListener()
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
    }

    private fun setButtonBackOnClickListener() {
        btn_about_main.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }
    }

    private fun showListAnimal() {
        rv_animals.layoutManager = LinearLayoutManager(this)
        rv_animals.adapter = listAnimalAdapter
    }
}