package com.example.aston_fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import com.example.aston_fragments.MainActivity
import com.example.aston_fragments.R

class CFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_c, container, false)
        val textViewData = view.findViewById<TextView>(R.id.textDisplay)
        val buttonToD = view.findViewById<Button>(R.id.buttonToFragmentD)
        val buttonToA = view.findViewById<Button>(R.id.buttonToFragmentA)

        val dataToC = arguments?.getString("dataToC")
        textViewData.text = dataToC

        buttonToD.setOnClickListener {
            val fragmentD = DFragment()
            (activity as MainActivity).navigateToFragment(fragmentD)
        }

        buttonToA.setOnClickListener {
            activity?.supportFragmentManager?.popBackStack(
                null,
                FragmentManager.POP_BACK_STACK_INCLUSIVE
            )
            val fragmentA = AFragment()
            (activity as MainActivity).navigateToFragment(fragmentA)
        }
        return view
    }
}