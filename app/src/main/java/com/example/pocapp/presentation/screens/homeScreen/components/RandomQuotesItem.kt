package com.example.pocapp.presentation.screens.homeScreen.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.pocapp.domain.models.AllQuotesDC

@Composable
fun RandomQuotesItem(quoteDC: AllQuotesDC.QuoteDC) {
    QuoteItem(
        quoteDC = quoteDC,
        color = Color.DarkGray,
        textColor = Color.White
    )
}

@Preview
@Composable
private fun RandomQuotesItemPreview(){
    RandomQuotesItem(AllQuotesDC.QuoteDC())
}