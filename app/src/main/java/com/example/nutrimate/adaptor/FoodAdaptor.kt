package com.example.nutrimate.adaptor

import androidx.recyclerview.widget.RecyclerView
import com.example.nutrimate.data.model.Food
import com.example.nutrimate.databinding.FoodItemViewBinding

class FoodAdaptor(var foodList: List<Food>) {
    class ViewHolder(val binding: FoodItemViewBinding) : RecyclerView.ViewHolder(binding.root) {
        val itemImage = binding.itemImage
        val itemName = binding.itemName

        
    }
}