package com.example.pocapp.domain.usecases

import com.example.pocapp.domain.models.AllQuotesDC
import com.example.pocapp.domain.repository.QuoteRepository
import io.mockk.coEvery
import io.mockk.mockk
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import retrofit2.Response


class AllQuotesUseCaseTest {
    private lateinit var quoteRepository: QuoteRepository
    private lateinit var allQuotesUseCase: AllQuotesUseCase

    @Before
    fun setUp() {
        quoteRepository = mockk()
        allQuotesUseCase = AllQuotesUseCase(quoteRepository)
    }

    @Test
    fun `invoke emits quotes when response is successful`() = runTest {
        val quotes = listOf(
            AllQuotesDC.QuoteDC("A", 1, "Abc"),
            AllQuotesDC.QuoteDC("B", 2, "XYZ")
        )
        val response = Response.success(AllQuotesDC(quotes=quotes))

        coEvery{
            quoteRepository.getAllQuotes()
        } returns response

        val result = allQuotesUseCase().first()
        assertEquals(quotes,result)
    }

    /*@Test
    fun `invoke returns nothing when response is not successful`() = runTest {
        val errorResponse:Response<AllQuotesDC> = Response.error(404,"".toResponseBody())
    }*/
}