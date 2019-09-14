package com.nemesis.course.completed.pokemon.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.nemesis.course.completed.pokemon.model.Pokemon
import com.nemesis.course.completed.pokemon.R

interface OptionsListener{
    fun onOptionSelected(option: Pokemon)
}

class OptionsFragment: Fragment(){

    private lateinit var btnOptionA: Button
    private lateinit var btnOptionB: Button
    private lateinit var btnOptionC: Button

    var listener: OptionsListener? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_options, container, false)

        btnOptionA = view.findViewById(R.id.button_optionA)
        btnOptionA.setOnClickListener {
            optionSelected(btnOptionA.tag as Pokemon)
        }

        btnOptionB = view.findViewById(R.id.button_optionB)
        btnOptionB.setOnClickListener {
            optionSelected(btnOptionB.tag as Pokemon)
        }

        btnOptionC = view.findViewById(R.id.button_optionC)
        btnOptionC.setOnClickListener {
            optionSelected(btnOptionC.tag as Pokemon)
        }

        return view
    }

    fun showOptions(options: ArrayList<Pokemon>) {
        btnOptionA.setText(options[0].name)
        btnOptionA.tag = options[0]

        btnOptionB.setText(options[1].name)
        btnOptionB.tag = options[1]

        btnOptionC.setText(options[2].name)
        btnOptionC.tag = options[2]
    }

    private fun optionSelected(option: Pokemon){
        listener?.onOptionSelected(option)
    }
}