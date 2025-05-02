package com.example.pocapp.data.remote

import com.example.pocapp.domain.models.AllQuotesDC
import com.example.pocapp.network.ALL_QUOTES
import com.example.pocapp.network.GET_SINGLE_QUOTE
import com.example.pocapp.network.RANDOM_QUOTE
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {

    @GET(ALL_QUOTES)
    suspend fun getAllQuotes(): Response<AllQuotesDC>


    @GET(RANDOM_QUOTE)
    suspend fun getRandomQuote(): Response<AllQuotesDC.QuoteDC>

    @GET(GET_SINGLE_QUOTE)
    suspend fun getSingleQuotes(
        @Path("id") id: String
    ): Response<AllQuotesDC.QuoteDC>


}