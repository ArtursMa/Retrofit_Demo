package service

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val BASE_URL:String = "https://dog.ceo/"

private val retrofit =Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL).build()
val dogService = retrofit.create(DogRetrofitService::class.java)



}