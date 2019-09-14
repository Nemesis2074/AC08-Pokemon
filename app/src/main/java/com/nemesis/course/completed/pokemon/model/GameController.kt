package com.nemesis.course.completed.pokemon.model

class GameController {

    private var listOfPokemon = Pokemon.loadAllPokemon()

    var options = ArrayList<Pokemon>()
    var answer = Pokemon()

    var correctCount:Int = 0
    var wrongCount:Int = 0

    fun generateQuestion(){
        val randomOptions = this.generateRandomOptions()
        val pokemonPosition = (0 until randomOptions.size).random()
        options = randomOptions
        answer = randomOptions[pokemonPosition]
    }

    fun isCorrectAnswer(optionSelected: Pokemon): Boolean{
        return (this.answer.number == optionSelected.number)
    }

    private fun generateRandomOptions(): ArrayList<Pokemon>{
        val options = ArrayList<Pokemon>()

        do{
            val position = (0 until listOfPokemon.size).random()

            val pokemon = listOfPokemon[position]

            if(!options.contains(pokemon)) {
                options.add(pokemon)
            }

        }while(options.size < 3)

        return options
    }

}