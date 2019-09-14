package com.nemesis.course.completed.pokemon.model

import android.support.annotation.DrawableRes
import android.support.annotation.StringRes
import com.nemesis.course.completed.pokemon.R

class Pokemon {

    var number:Int = 0

    @StringRes
    var name:Int = R.string.poke_001

    @DrawableRes
    var image:Int = R.drawable.img_poke_001

    companion object{

        fun loadAllPokemon(): ArrayList<Pokemon>{

            val array = ArrayList<Pokemon>()

            val pokemon001 = Pokemon()
            pokemon001.number = 1
            pokemon001.name = R.string.poke_001
            pokemon001.image = R.drawable.img_poke_001
            array.add(pokemon001)

            val pokemon002 = Pokemon()
            pokemon002.number = 2
            pokemon002.name = R.string.poke_002
            pokemon002.image = R.drawable.img_poke_002
            array.add(pokemon002)

            val pokemon003 = Pokemon()
            pokemon003.number = 3
            pokemon003.name = R.string.poke_003
            pokemon003.image = R.drawable.img_poke_003
            array.add(pokemon003)

            val pokemon004 = Pokemon()
            pokemon004.number = 4
            pokemon004.name = R.string.poke_004
            pokemon004.image = R.drawable.img_poke_004
            array.add(pokemon004)

            val pokemon005 = Pokemon()
            pokemon005.number = 5
            pokemon005.name = R.string.poke_005
            pokemon005.image = R.drawable.img_poke_005
            array.add(pokemon005)

            val pokemon006 = Pokemon()
            pokemon006.number = 6
            pokemon006.name = R.string.poke_006
            pokemon006.image = R.drawable.img_poke_006
            array.add(pokemon006)

            val pokemon007 = Pokemon()
            pokemon007.number = 7
            pokemon007.name = R.string.poke_007
            pokemon007.image = R.drawable.img_poke_007
            array.add(pokemon007)

            val pokemon008 = Pokemon()
            pokemon008.number = 8
            pokemon008.name = R.string.poke_008
            pokemon008.image = R.drawable.img_poke_008
            array.add(pokemon008)

            val pokemon009 = Pokemon()
            pokemon009.number = 9
            pokemon009.name = R.string.poke_009
            pokemon009.image = R.drawable.img_poke_009
            array.add(pokemon009)

            val pokemon010 = Pokemon()
            pokemon010.number = 10
            pokemon010.name = R.string.poke_010
            pokemon010.image = R.drawable.img_poke_010
            array.add(pokemon010)

            val pokemon011 = Pokemon()
            pokemon011.number = 11
            pokemon011.name = R.string.poke_011
            pokemon011.image = R.drawable.img_poke_011
            array.add(pokemon011)

            val pokemon012 = Pokemon()
            pokemon012.number = 12
            pokemon012.name = R.string.poke_012
            pokemon012.image = R.drawable.img_poke_012
            array.add(pokemon012)

            return array
        }

    }

}