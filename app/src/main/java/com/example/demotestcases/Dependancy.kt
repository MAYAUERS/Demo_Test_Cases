package com.example.demotestcases

class Dependancy {

    fun calculateResult() =42
}

class Subject(dependancy: Dependancy)
{
    val result=dependancy.calculateResult()
}
