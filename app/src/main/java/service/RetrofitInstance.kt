package service

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.google.gson.GsonBuilder




object RetrofitInstance {

    private val BASE_URL:String = "https://dog.ceo/"

    var gson = GsonBuilder()
        .setLenient()
        .create()

private val retrofit =Retrofit.Builder().addConverterFactory(GsonConverterFactory.create(gson) )
    .baseUrl(BASE_URL).build()
 val dogService = retrofit.create(DogRetrofitService::class.java)



}