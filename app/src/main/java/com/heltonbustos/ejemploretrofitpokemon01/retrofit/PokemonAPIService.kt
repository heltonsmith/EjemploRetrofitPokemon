package com.heltonbustos.ejemploretrofitpokemon01.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonAPIService {

    @GET("{nombre}")
    fun obtenerPokemon(@Path("nombre") nombre: String): Call<Pokemon2>

}