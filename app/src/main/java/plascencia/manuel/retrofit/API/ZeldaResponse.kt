package plascencia.manuel.retrofit.API

import com.squareup.moshi.Json

data class ZeldaResponse(
    @Json(name ="data") val elementos:List<ZeldaItem>
)
