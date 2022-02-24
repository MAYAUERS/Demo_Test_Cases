package com.example.demotestcases

interface Birds {

    fun colors() :String

    fun species() :String

}

class Peacock :Birds{
    override fun colors(): String {
        return "Black"
    }

    override fun species(): String {
        return "Don't know"
    }


}

