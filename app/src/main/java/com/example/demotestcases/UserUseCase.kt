package com.example.demotestcases

import retrofit2.Response

/*
class UserUseCase :UserRepository {
    override suspend fun getData(): Response<List<Users>> {
       return getData()
    }
}*/

class UserUseCase (private val userRepository: UserRepository){

    suspend operator fun invoke():Response<List<Users>>{
        return userRepository.getData()
    }
}