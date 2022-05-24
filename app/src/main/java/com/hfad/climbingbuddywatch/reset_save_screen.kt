package com.hfad.climbingbuddywatch


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController


/**
 * A simple [Fragment] subclass.
 */
class reset_save_screen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_reset_save_screen, container, false)

        val saveButton = view.findViewById<Button>(R.id.save_button)
        val resetButton = view.findViewById<Button>(R.id.reset_button)

        //save button listener
        saveButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_reset_save_screen_to_start_screen)
        }
        //reset button listener
        resetButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_reset_save_screen_to_start_screen)
        }


        // Inflate the layout for this fragment
        return view
    }




}