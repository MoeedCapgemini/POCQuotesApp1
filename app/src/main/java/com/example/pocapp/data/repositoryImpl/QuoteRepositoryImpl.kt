package com.example.pocapp.data.repositoryImpl

import com.example.pocapp.data.remote.ApiInterface
import com.example.pocapp.domain.models.AllQuotesDC
import com.example.pocapp.domain.repository.QuoteRepository
import retrofit2.Response
import javax.inject.Inject

class QuoteRepositoryImpl @Inject constructor(private val apiInterface: ApiInterface):QuoteRepository {
    override suspend fun getAllQuotes(): Response<AllQuotesDC> {
        return apiInterface.getAllQuotes()
    }

    override suspend fun getRandomQuote(): Response<AllQuotesDC.QuoteDC> {
        return apiInterface.getRandomQuote()
    }

    override suspend fun getSingleQuote(id: String): Response<AllQuotesDC.QuoteDC> {
        return apiInterface.getSingleQuotes(id)
    }
}