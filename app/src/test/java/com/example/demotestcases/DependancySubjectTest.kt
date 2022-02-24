package com.example.demotestcases

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import junit.framework.Assert.assertEquals
import org.junit.Test

class DependancySubjectTest {


    @Test
    fun getDependancyTest(){
    //given
    val mockkDependancy = mockk<Dependancy>()
       every { mockkDependancy.calculateResult() } returns 120

       //when
       val subject =Subject(mockkDependancy)

        //then
        verify { Subject(mockkDependancy) }
        assertEquals(subject.result,120)

    }
}