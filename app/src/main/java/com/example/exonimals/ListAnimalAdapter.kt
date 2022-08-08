package com.example.exonimals

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target.SIZE_ORIGINAL
import com.squareup.picasso.Picasso

class ListAnimalAdapter(private val listAnimal: ArrayList<Animal>): RecyclerView.Adapter<ListAnimalAdapter.ListViewHolder>() {
    private lateinit var clicked: ItemClicked

    interface ItemClicked {
        fun click(position: Int)
    }

    fun setClicked(clicked: ItemClicked){
        this.clicked = clicked
    }

    class ListViewHolder(itemView: View, itemClicked: ItemClicked): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_name)
        var tvHabitat: TextView =  itemView.findViewById(R.id.tv_habitat)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_photo)

        init {
            itemView.setOnClickListener{
                itemClicked.click(absoluteAdapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_animals, parent, false)

        return ListViewHolder(view, clicked)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val animal = listAnimal[position]

        Glide.with(holder.itemView.context)
            .load(animal.photo)
            .fitCenter()
            .into(holder.imgPhoto)

        holder.tvName.text = animal.name
        holder.tvHabitat.text = animal.habitat
    }

    override fun getItemCount(): Int {
        return listAnimal.size
    }
}