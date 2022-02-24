package com.example.demotestcases

class TestableService {

    fun getDataFromDb(testParameter: String): String {
        // query database and return matching value
        return "Some Parameters"
    }

    fun doSomethingElse(testParameter: String): String {
        return "I don't want to!"
    }
}

object SingleTonExample{

    fun getStrings(str:String):String
    {
        return "str"
    }
}

class TestableList {

    fun getDataFromDb(mutableList: String) {

    }

}
