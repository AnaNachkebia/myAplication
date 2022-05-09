package com.example.shualeduri_2varianti.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import androidx.navigation.Navigation
import com.example.shualeduri_2varianti.R

class FirstFragment : Fragment(R.layout.fragment_first) {
    private lateinit var editText:EditText
    private lateinit var forwardArrow:ImageButton
    private lateinit var personIcon:ImageButton

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController=Navigation.findNavController(view)

        editText=view.findViewById(R.id.editText1)
        forwardArrow=view.findViewById(R.id.forwardArrow)
        personIcon=view.findViewById(R.id.personIcon1)
        editText.setOnClickListener {
            val name=editText.text.toString()
            if(name.isEmpty()){
                return@setOnClickListener
            }
            val action=FirstFragmentDirections.actionFirstFragmentToSecondFragment(name)
            navController.navigate(action)
        }
        personIcon.setOnClickListener{
            val action1=FirstFragmentDirections.actionFirstFragmentToSecondFragment()
            navController.navigate(action1)
        }

    }

}