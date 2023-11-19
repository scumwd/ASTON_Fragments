package com.example.aston_fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentManager
import com.example.aston_fragments.MainActivity
import com.example.aston_fragments.R

class DFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_d, container, false)
        val buttonToB = view.findViewById<Button>(R.id.buttonToFragmentB)

        buttonToB.setOnClickListener {
            activity?.supportFragmentManager?.popBackStack(
                null,
                FragmentManager.POP_BACK_STACK_INCLUSIVE
            )
            val fragmentB = BFragment()
            (activity as MainActivity).navigateToFragment(fragmentB)
        }
        return view
    }
}