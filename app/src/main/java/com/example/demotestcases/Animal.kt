package com.example.demotestcases

abstract class Animal {

    fun sounds() {
        println("Hi Im sound of Animal")
    }

    abstract fun food()
}

class Dog : Animal() {
    override fun food() {
       println("Hi Im getting food for Dog")
    }

}