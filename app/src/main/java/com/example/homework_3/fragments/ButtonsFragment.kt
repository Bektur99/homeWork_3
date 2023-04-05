package com.example.homework_3.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.homework_3.MainViewModel
import com.example.homework_3.R
import com.example.homework_3.databinding.FragmentButtonsBinding

class ButtonsFragment : Fragment() {
    private lateinit var viewModel: MainViewModel
    private lateinit var binding: FragmentButtonsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentButtonsBinding.inflate(layoutInflater)
        return inflater.inflate(R.layout.fragment_buttons, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]

        binding.increment.setOnClickListener {
            viewModel.increment()
        }

        binding.decrement.setOnClickListener {
            viewModel.decrement()
        }
    }
}