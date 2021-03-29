package com.akih.materiweek1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.akih.materiweek1.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(layoutInflater)
        val FragmentSecondBinding = SecondFragment()
        val mBundle = Bundle()
        mBundle.putString(SecondFragment.EXTRA_NAME, "ZADA")

        FragmentSecondBinding.arguments = mBundle

        val mFragmentManager = fragmentManager

        binding.btnSendToFragment2.setOnClickListener {
            mFragmentManager?.beginTransaction()?.apply {
                replace(R.id.container_fragment, FragmentSecondBinding, SecondFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
        return binding.root
    }

}