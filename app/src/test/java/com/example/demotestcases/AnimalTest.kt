package com.example.demotestcases

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import junit.framework.Assert.assertEquals
import org.junit.Test

class AnimalTest {


    @Test
    fun getAnimalTest(){
        //given
        val animal = mockk<Animal>()
        every { animal.sounds()} .returns(Unit)

        //when
        val result =animal.sounds()
        verify { animal.sounds() }
        assertEquals(Unit,result)

        every { animal.food() }.returns(Unit)
        val r=animal.food()
        verify { animal.food() }
        assertEquals(Unit,r)
    }

}