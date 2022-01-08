package com.example.munchkinhelper.recycler

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.munchkinhelper.R
import com.example.munchkinhelper.databinding.FragmentPlayerListBinding
import com.example.munchkinhelper.databinding.PlayerItemBinding

class PlayerRecyclerViewHolder(private val binding: PlayerItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(playerItem: PlayerRecyclerViewItem) {
        binding.personName.text = playerItem.nickname
        binding.damageText.text = playerItem.damage.toString()
        binding.levelText.text = playerItem.level.toString()
        binding.personIcon.text = playerItem.nickname[0].toString()
        binding.sexPicture.setImageResource(
            when (playerItem.sex) {
                Sex.Female -> R.drawable.ic_baseline_check_24
                Sex.Male -> R.drawable.ic_baseline_add_24
            }
        )
    }
}