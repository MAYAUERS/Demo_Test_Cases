package com.example.demotestcases

import retrofit2.Response

interface UserRepository {

    suspend fun getData() :Response<List<Users>>
}