package com.example.demotestcases

import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.mockk
import io.mockk.mockkObject
import io.mockk.verify
import junit.framework.Assert.assertEquals
import org.junit.Test

class ExampleClassTest {

    @MockK
    lateinit var example :ExampleClass

    @MockK
    lateinit var injected: Injected

    @MockK
    lateinit var exampleWithDependancy: ExampleWithDependancy

    @Test
    fun exampleClassTest(){
        //given
        example = mockk<ExampleClass>()
        every { example.multiplyByTen(4) }returns  40

        //when
        val result=example.multiplyByTen(4)

        //then
        verify { example.multiplyByTen(4) }
        assertEquals(40,result)

    }

    @Test
    fun publicFunTest(){
        ///
        //given
        example = mockk<ExampleClass>()
        every { example.publicFunction() }returns "Public Fun Called"

        //when
        val resultPublicFun=example.publicFunction()

        //then
        verify { example.publicFunction() }
        assertEquals( "Public Fun Called",resultPublicFun)

    }

    @Test
    fun mocckForProperty(){
        //given
        injected = mockk<Injected>()
        every { injected.multipyByFive(5) } returns 25

        //when
        val multipyByFive =injected.multipyByFive(5)

        //then
        verify { injected.multipyByFive(5) }
        assertEquals(25,multipyByFive)
    }

    @Test
    fun exampleWithDependancyTest(){
        injected = mockk<Injected>()
        exampleWithDependancy = mockk<ExampleWithDependancy>()

        every { exampleWithDependancy.returedInjectedValue(10) } returns 50

        val retunedValue= exampleWithDependancy.returedInjectedValue(10)

        verify { exampleWithDependancy.returedInjectedValue(10) }
        assertEquals(50,retunedValue)

    }

    @Test
    fun mockkAnOject(){
        mockkObject(ExampleObject)

        every { ExampleObject.conCat(any(),any()) } returns "MeeraPotdar"

        val concat=ExampleObject.conCat("","")

        verify { ExampleObject.conCat("","") }
        assertEquals("MeeraPotdar",concat)

    }
}