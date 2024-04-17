package plascencia.manuel.retrofit.API

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

class ApiRepository {
    private val zeldaApi: ZeldaApi

    init {
        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://botw-compendium.herokuapp.com/api/v3/compendium/")
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
        zeldaApi = retrofit.create()
    }

    suspend fun fetchContents():List<ZeldaItem> = zeldaApi.fetchContents().elementos
}