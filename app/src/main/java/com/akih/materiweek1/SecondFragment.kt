package com.akih.materiweek1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.akih.materiweek1.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {


    private lateinit var binding: FragmentSecondBinding
    companion object{
        var EXTRA_NAME = "extra_name"
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (arguments != null){
            val nama = arguments?.getString(EXTRA_NAME)
            binding.tvSecondFragment.text = nama
        }
    }

}