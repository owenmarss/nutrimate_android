package com.example.nutrimate.adaptor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nutrimate.R
import com.example.nutrimate.data.model.Food
import com.example.nutrimate.databinding.FoodItemViewBinding

class FoodAdaptor(var foodList: List<Food>): RecyclerView.Adapter<FoodAdaptor.ViewHolder>() {
    class ViewHolder(binding: FoodItemViewBinding) : RecyclerView.ViewHolder(binding.root) {
        val itemImage = binding.itemImage
        val itemName = binding.itemName

            fun bind(food: Food) {
                itemImage.setImageResource(R.drawable.burger)
                itemName.text = food.name
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = FoodItemViewBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return foodList.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(foodList[position])
    }
}