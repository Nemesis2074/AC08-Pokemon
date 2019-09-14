package com.nemesis.course.completed.pokemon.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.nemesis.course.completed.pokemon.model.Pokemon
import com.nemesis.course.completed.pokemon.R
import android.media.MediaPlayer

class PokemonFragment: Fragment(){

    private lateinit var imgPokemon:ImageView
    private lateinit var imgPokemonShadow:ImageView

    private lateinit var txtCorrectScore:TextView
    private lateinit var txtWrongScore:TextView

    private lateinit var player:MediaPlayer


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_pokemon, container, false)

        imgPokemon = view.findViewById(R.id.pokemon)
        imgPokemonShadow = view.findViewById(R.id.shadow)

        txtCorrectScore = view.findViewById(R.id.correct_score)
        txtWrongScore = view.findViewById(R.id.wrong_score)

        return view
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        player = MediaPlayer.create(context, R.raw.whos)
    }

    fun showPokemon(pokemon: Pokemon){
        imgPokemon.setImageResource(pokemon.image)
        imgPokemon.visibility = View.INVISIBLE

        imgPokemonShadow.setImageResource(pokemon.image)
        imgPokemonShadow.visibility = View.VISIBLE

        //player.start()
    }

    fun updateScore(correct:Int, wrong:Int){
        txtCorrectScore.text = getString(R.string.text_correct, correct)
        txtWrongScore.text = getString(R.string.text_wrong, wrong)

        showAnswer()
    }

    private fun showAnswer(){
        imgPokemon.visibility = View.VISIBLE
        imgPokemonShadow.visibility = View.INVISIBLE
    }

}