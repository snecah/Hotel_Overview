package com.example.feature_room.ui

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.feature_room.R
import com.example.feature_room.databinding.FragmentRoomsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RoomsFragment : Fragment(R.layout.fragment_rooms) {
    private val viewModel by viewModels<RoomsViewModel>()
    private val binding by viewBinding(FragmentRoomsBinding::bind)
    private val adapter by lazy { RoomsAdapter(makeToast()) }

    private fun makeToast(): () -> Unit = {Toast.makeText(requireContext(), "sfdsf", Toast.LENGTH_SHORT).show()}


    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel.getRoomsData()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        binding.recyclerView.adapter = adapter

        viewModel.rooms.observe(viewLifecycleOwner) {
            adapter.items = it.rooms
        }
    }
}