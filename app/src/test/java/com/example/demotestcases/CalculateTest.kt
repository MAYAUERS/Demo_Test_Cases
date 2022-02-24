package com.example.demotestcases

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import junit.framework.Assert.assertEquals
import org.junit.Test

class CalculateTest {


    @Test
    fun getAddTwoNosTest() {
        //given
        val addition = mockk<CalCulate>()
        every { addition.addTwoNos(4, 8) } returns 12

        //when
        val result = addition.addTwoNos(4, 8)

        //then
        verify { addition.addTwoNos(4, 8) }
        assertEquals(12, result)
    }

    @Test
    fun getSubTwoNosTest() {

        //then
        val substraction = mockk<CalCulate>()
        every { substraction.SubscracteTwoNos(40, 10) } returns 30

        //when
        val result = substraction.SubscracteTwoNos(40, 10)

        //then
        verify { substraction.SubscracteTwoNos(40, 10) }
        assertEquals(30, result)
    }




    @Test
    fun getMultiplyTwoNosTest(){
        //given
        val multiply = mockk<CalCulate>()
        every { multiply.multiplyTwoNos(10,20) } returns  200

        //when
        val result=multiply.multiplyTwoNos(10,20)

        verify { multiply.multiplyTwoNos(10,20) }
        assertEquals(200,result)
    }



    @Test
    fun `divisionOfTwoNosTest` (){
//given
        val calCulate:CalCulate =mockk()

        every { calCulate.DivisionOfTwoNos(100,2) }returns 50
       //when
       val division=calCulate.DivisionOfTwoNos(100,2)

       //then
       verify { calCulate.DivisionOfTwoNos(100,2) }

        assertEquals(50,division)

    }













}