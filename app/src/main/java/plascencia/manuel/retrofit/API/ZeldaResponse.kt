package plascencia.manuel.retrofit.API

import com.squareup.moshi.Json

data class ZeldaResponse<T>(
    @Json(name ="data") val elementos:List<ZeldaItem>
)
