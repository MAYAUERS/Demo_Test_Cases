package com.example.demotestcases

import android.text.TextUtils

class StringChecker {

    fun isTextEmpty(text : String) : Boolean{
        return TextUtils.isEmpty(text)
    }
}