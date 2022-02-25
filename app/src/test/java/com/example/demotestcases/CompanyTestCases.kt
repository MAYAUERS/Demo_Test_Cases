package com.example.demotestcases

import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.Test

class CompanyTestCases {


    @Test
    fun CompanyTest(){

        val company:Company= mockk()
        every { company.salary() }returns 25000L

        val result= company.salary()
        assert(result==25000L)
        verify { company.salary() }
    }
}