package service

import data.Dog
import retrofit2.Call
import retrofit2.http.GET

interface DogRetrofitService {
    @GET("dog-api/documentation/random")
    fun getRandomDog(): Call<List<Dog>>
}