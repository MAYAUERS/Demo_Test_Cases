package com.example.demotestcases

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import junit.framework.Assert.assertEquals
import org.junit.Test

class DogClassTest {

    @Test
    fun getDogTest(){

        //given
        val dog= mockk<Dog>()
        every { dog.sounds() }returns Unit

        val result =dog.sounds()

        verify { dog.sounds() }
        assertEquals(Unit,result)
    }
}