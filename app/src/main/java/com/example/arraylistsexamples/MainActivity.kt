package com.example.arraylistsexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.nio.charset.CharacterCodingException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //declaration and initialization of an arraylist
        val myNumbers: ArrayList<Int> = ArrayList()

        val myList = ArrayList<String>()

        myList.add("Felix Njuguna")
        myList.add("Geek Programmer")

        //we can choose where to insert the entry
        myList.add(1,"Hello fellow programmers")
        //checking through the array list
        if(myList.isEmpty()){
            Log.i("info:","The array list is empty")
        }else{
            Log.i("info:", myList.toString())
        }
        //checks the size of the array list
        val arraySize = myList.size

        //stating the index of te variable
        val position = myList.indexOf("Geek Programmer")




        //we can also insert classes inside the arraylist
        /*
        * val myAnimal = Animal()
        * val myCow = Cow()
        * val myBat = Bat()
        *
        * This creates an array list with a limit of 10
        * val Animals = arrayOfNulls<Animal>(10)
        * Animals[0] = myAnimal
        * Animals[1] = myCow
        * Animals[2] = myBat
        *
        * val myElephant = Elephant()
        * myAnimals[3] = myElephant
        * */


                //HASH MAPS
    val characterMap: Map<String,Character>
    characterMap = HashMap()

        characterMap.put("Monkey",Character())
        characterMap.put("D.",Character())
        characterMap.put("Luffy",Character())


            //retrieving values from the hash map
        val monkey = characterMap.get("Monkey")
            // we can also use the Characters class functions
        /*

        * Suppose we have a class Pirate() and function treasure
        *
                characterMap.get("Luffy").treasure()
        *
                or

                characterMap.get("D.").treasure("Gold")


        * */





    }

    private fun Character(): Character {
        TODO("Not yet implemented")
    }

}