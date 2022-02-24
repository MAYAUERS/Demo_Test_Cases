package com.example.demotestcases

import android.text.TextUtils
import io.mockk.*
import io.mockk.impl.annotations.MockK
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class StringCheckerTest {

    @MockK
    private lateinit var stringChecker : StringChecker

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxUnitFun = true)
        mockkStatic(TextUtils::class)
    }

    @Test
    fun stringChecker_Is_Empty() {

        //given
        val stringcheck = mockk<StringChecker>()
        every { stringcheck.isTextEmpty(any()) } returns true

        //when
        val result =stringcheck.isTextEmpty("test")

        //then
        verify { stringcheck.isTextEmpty("test") }
        assertEquals(true,result)

    }
}