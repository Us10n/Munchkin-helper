package com.example.munchkinhelper.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.munchkinhelper.R
import com.example.munchkinhelper.databinding.FragmentPlayerListBinding
import com.example.munchkinhelper.viewmodel.PlayerListFragmentViewModel
import javax.inject.Inject


class PlayerListFragment : Fragment(R.layout.fragment_player_list) {

    private lateinit var binding: FragmentPlayerListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentPlayerListBinding.inflate(inflater)
        return binding.root
    }


}