package com.example.demotestcases

import io.mockk.*
import io.mockk.impl.annotations.MockK
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.runBlocking
import org.junit.Test
import retrofit2.Response

class UserTest {

    private val userResponse = mockk<List<Users>>()

   /* @Test
    fun getUserUseCaseTest() = runBlocking{
        val users= mockk<UserUseCase>()

        var res=Response.success(userResponse)

        coEvery { users.getData() }returns res

        val result =users.getData()
        coVerify { users.getData()}

        assertEquals(res.isSuccessful,result)

    }
*/
    @Test
    fun getUserUseCase() = runBlocking{

        val userRepository = mockk<UserRepository>()
        val userUseCase = mockk<UserUseCase>()
        var res=Response.success(userResponse)
     //  val error =Response.success(userResponse).errorBody()
        coEvery { userUseCase.invoke() } returns res
        coEvery { userRepository.getData() }returns res

       val result1= userRepository.getData()
       val result2=userUseCase.invoke()

       coVerify { userRepository.getData() }
       coVerify { userUseCase.invoke() }

       assertEquals(res,result1)
       assertEquals(res,result2)


      /* //erro
       coEvery { userUseCase.invoke().errorBody() } returns error
       coEvery { userRepository.getData().errorBody() }returns error

       val result11= userRepository.getData().errorBody()
       val result22=userUseCase.invoke().errorBody()

       coVerify { userRepository.getData().errorBody() }
       coVerify { userUseCase.invoke().errorBody() }

       assertEquals(error,result11)
       assertEquals(error,result22)*/
    }
}