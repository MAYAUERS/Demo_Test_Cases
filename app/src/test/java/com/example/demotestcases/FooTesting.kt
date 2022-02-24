package com.example.demotestcases

import io.mockk.every
import io.mockk.mockk
import junit.framework.Assert.assertEquals
import org.junit.Test

class FooTesting {

    @Test
    fun FooTest(){

        val foo = mockk<Foo>(){
            every { name } returns "Meera"
            every { bar } returns mockk{
                every { nickname } returns "Potdar"
            }
        }
      /*  every { foo.name } returns "Meera"
        every { foo.bar.nickname } returns "Potdar"*/

        val t1=foo.name
        val t2=foo.bar.nickname
        assertEquals("Meera",t1)
        assertEquals("Potdar",t2)
    }
}