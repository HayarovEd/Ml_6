package com.forexinsights.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.forexinsights.R
import com.forexinsights.theme.baseBackground
import com.forexinsights.theme.secondText


@Composable
fun EmptyDataScreen(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = baseBackground),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = modifier.align(alignment = Alignment.Center),
            text = stringResource(id = R.string.error_101),
            fontSize = 22.sp,
            fontWeight = FontWeight(600),
            fontStyle = FontStyle(R.font.nunito),
            color = secondText,
            textAlign = TextAlign.Center
        )
    }
}