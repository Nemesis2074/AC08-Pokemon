package com.nemesis.course.completed.pokemon

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.nemesis.course.completed.pokemon.fragments.OptionsFragment
import com.nemesis.course.completed.pokemon.fragments.OptionsListener
import com.nemesis.course.completed.pokemon.fragments.PokemonFragment
import com.nemesis.course.completed.pokemon.model.GameController
import com.nemesis.course.completed.pokemon.model.Pokemon

class MainActivity : AppCompatActivity(), OptionsListener {

    private lateinit var fragmentPokemon: PokemonFragment
    private lateinit var fragmentOptions: OptionsFragment

    private var gameController = GameController()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupGame()
    }

    override fun onOptionSelected(option: Pokemon) {
        if(gameController.isCorrectAnswer(option)){
            gameController.correctCount += 1
            Toast.makeText(applicationContext, R.string.alert_correct, Toast.LENGTH_SHORT).show()
        }else{
            gameController.wrongCount += 1
            Toast.makeText(applicationContext, R.string.alert_wrong, Toast.LENGTH_SHORT).show()
        }

        fragmentPokemon.updateScore(gameController.correctCount, gameController.wrongCount)

        Handler().postDelayed({

            showNextQuestion()

        }, 3000)
    }

    private fun setupGame(){
        fragmentPokemon = supportFragmentManager.findFragmentById(R.id.fragment_pokemon) as PokemonFragment
        fragmentOptions = supportFragmentManager.findFragmentById(R.id.fragment_options) as OptionsFragment

        fragmentOptions.listener = this

        showNextQuestion()
    }

    private fun showNextQuestion(){

        gameController.generateQuestion()

        fragmentPokemon.showPokemon(gameController.answer)
        fragmentOptions.showOptions(gameController.options)
    }

}
