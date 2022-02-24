package com.example.demotestcases

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import junit.framework.Assert.assertEquals
import org.junit.Test

class PeakcockClassTest {


    @Test
    fun peakcockTest(){

        val peacock = mockk<Peacock>()
        every { peacock.colors() }returns "Color"

        val result=peacock.colors()
        verify { peacock.colors() }
        assertEquals("Color",result)

        every { peacock.species() }returns "Dont Know"

        val r= peacock.species()
        verify { peacock.species() }
        assertEquals("Dont Know",r)
    }

    @Test
    fun BirdInterfaceTest(){

        val birds = mockk<Birds>()
        every { birds.colors() }returns String()

        val result=birds.colors()
        verify { birds.colors() }
        assertEquals(String(),result)

    }

}