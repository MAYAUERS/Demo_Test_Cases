package com.example.demotestcases

class ExampleClass {

    fun multiplyByTen(number :Int) =number*10

    fun publicFunction()= privateFunction()

    private fun privateFunction() ="Return Private fun value"

}

class Injected(){
    fun multipyByFive(num:Int) = num*5
}

class ExampleWithDependancy{

    lateinit var injected: Injected

    fun returedInjectedValue(number: Int) :Int{
        return injected.multipyByFive(number)
    }
}

object  ExampleObject{
    fun conCat(s1:String,s2:String) =s1+s2
}