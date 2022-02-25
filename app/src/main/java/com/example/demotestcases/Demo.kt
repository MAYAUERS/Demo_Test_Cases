package com.example.demotestcases

abstract class Employee{

    abstract fun salary(): Long
}

class Company() :Employee(){
    override fun salary(): Long {
        var d=25000L
       return d
        println(d)
    }

}