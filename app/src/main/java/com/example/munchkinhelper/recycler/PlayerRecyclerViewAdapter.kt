package com.example.munchkinhelper.recycler

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.munchkinhelper.R

class PlayerRecyclerViewAdapter: RecyclerView.Adapter<PlayerRecyclerViewHolder>() {
    var items = listOf<PlayerRecyclerViewItem>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerRecyclerViewHolder {
        if(viewType== R.layout.player_item){
            PlayerRecyclerViewHolder
        }
    }

    override fun onBindViewHolder(holder: PlayerRecyclerViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}