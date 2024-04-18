package plascencia.manuel.retrofit.API

import retrofit2.http.GET

interface ZeldaApi {
    @GET("all")
    suspend fun fetchContents():ZeldaResponse
}