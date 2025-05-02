package com.example.pocapp.di

import com.example.pocapp.data.remote.ApiInterface
import com.example.pocapp.data.repositoryImpl.QuoteRepositoryImpl
import com.example.pocapp.domain.repository.QuoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Singleton
    @Provides
    fun getQuotesRepository(apiInterface: ApiInterface): QuoteRepository = QuoteRepositoryImpl(apiInterface=apiInterface)

}