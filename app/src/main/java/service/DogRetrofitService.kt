package service

import data.Dog
import retrofit2.Call
import retrofit2.http.GET

interface DogRetrofitService {
    @GET("api/breeds/image/random")
    fun getRandomDog(): Call<Dog>
}