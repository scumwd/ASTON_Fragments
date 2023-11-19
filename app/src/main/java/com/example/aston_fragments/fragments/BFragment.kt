package com.example.aston_fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.aston_fragments.MainActivity
import com.example.aston_fragments.R

class BFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_b, container, false)
        val buttonToC = view.findViewById<Button>(R.id.buttonToFragmentC)
        val buttonBackToA = view.findViewById<Button>(R.id.buttonBackToFragmentA)

        buttonToC.setOnClickListener {
            val fragmentC = CFragment()
            val bundle = Bundle()
            bundle.putString("dataToC", "Hello Fragment C")
            fragmentC.arguments = bundle
            (activity as MainActivity).navigateToFragment(fragmentC)
        }

        buttonBackToA.setOnClickListener {
            activity?.onBackPressed()
        }
        return view
    }
}