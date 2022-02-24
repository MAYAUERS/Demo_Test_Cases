package com.example.demotestcases

import io.mockk.*
import junit.framework.Assert.assertEquals
import org.junit.Test

class TestableServiceTest {


    @Test
    fun getTestableServiceTest(){
        //given
        val service= mockk<TestableService>()
        every { service.getDataFromDb("Expected params") } returns "Expected Output"

        //when
        val result = service.getDataFromDb("Expected params")

        //then

        verify { service.getDataFromDb("Expected params") }
        assertEquals("Expected Output",result)

    }

    @Test
    fun doSomethingElseTest(){


        //given
        val service1= mockk<TestableService>()
        every { service1.doSomethingElse("Do something") } returns "Doing work"

        //when
        val result = service1.doSomethingElse("Do something")

        //then

        verify { service1.doSomethingElse("Do something") }
        assertEquals("Doing work",result)
    }

    @Test
    fun doTestForBoth(){
        val service2 = spyk<TestableService>()
        every { service2.getDataFromDb(any()) } returns "Actual Result"

        val firstresult=service2.getDataFromDb( "Actual Result any")
        assertEquals("Actual Result",firstresult)

        // when checking not mocked method
        val secondResult = service2.doSomethingElse("Any Param")

        // then
        assertEquals("I don't want to!", secondResult)
    }

    @Test
    fun getRelaxedMockKTest(){

        val service_1 = mockk<TestableService>(relaxed = true)

        val result =service_1.doSomethingElse("Any Value")

        assertEquals("",result)

    }

    @Test
    fun doSingletonClassTes(){
        mockkObject(SingleTonExample)

        every { SingleTonExample.getStrings(any()) }returns "Hi"

        val result=SingleTonExample.getStrings("Hi")

        verify { SingleTonExample.getStrings(any()) }

        assertEquals("Hi",result)
    }

    @Test
    fun slotCaptureTest(){
        val service_2= mockk<TestableService>()
        val slot= slot<String>()

        every { service_2.getDataFromDb(capture(slot)) }returns "Hi"

         service_2.getDataFromDb("Hi Meera")

        assertEquals("Hi Meera",slot.captured)

    }


    @Test
    fun mutableListTest(){
        val service_3= mockk<TestableList>()

        val list= mutableListOf<String>()

        every { service_3.getDataFromDb(capture(list)) } returns Unit

        service_3.getDataFromDb("Hi")
        service_3.getDataFromDb("Hi _1")
        assertEquals("Hi",list[0])
        assertEquals("Hi _1",list[1])

    }
}