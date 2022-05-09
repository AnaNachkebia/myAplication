package com.example.shualeduri_2varianti.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.navigation.Navigation
import com.example.shualeduri_2varianti.R

class SecondFragment : Fragment(R.layout.fragment_second) {
    private lateinit var backArrow:ImageButton
    private lateinit var textView:TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController= Navigation.findNavController(view)
        //view.findViewById<TextView>(R.id.textView2).text=SecondFragmentArgs.fromBundle(requireArguments()).name.toString()
        backArrow=view.findViewById(R.id.backArrow)
        textView=view.findViewById(R.id.textView2)
        textView.text=SecondFragmentArgs.fromBundle(requireArguments()).name.toString()
        backArrow.setOnClickListener{
            val action=SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            navController.navigate(action)
        }
    }

}