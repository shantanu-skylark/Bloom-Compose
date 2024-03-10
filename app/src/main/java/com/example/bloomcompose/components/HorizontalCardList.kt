package com.example.bloomcompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.bloomcompose.data.ListCardItem
import com.example.bloomcompose.ui.theme.Gray
import com.example.bloomcompose.ui.theme.White

@Composable
fun HorizontalCardList(cardItems: List<ListCardItem>) {
    Column {
        Text(
            text = "Browse themes",
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier
                .paddingFromBaseline(top = 32.dp)
                .padding(start = 16.dp),
            style = MaterialTheme.typography.headlineLarge
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(top = 16.dp, start = 16.dp)
        ) {
            items(items = cardItems) { cardItem ->
                CardItem(cardItem = cardItem)
            }
        }
    }
}

@Composable
private fun CardItem(cardItem: ListCardItem) {
    val cardShape = MaterialTheme.shapes.small.copy(
        bottomStart = CornerSize(0.dp),
        bottomEnd = CornerSize(0.dp)
    )
    Box(
        modifier = Modifier
            .size(138.dp)
            .padding(2.dp)
            .shadow(1.dp, cardShape),
    ) {
        Card(
            modifier = Modifier.size(136.dp),
            shape = MaterialTheme.shapes.small,
            colors = CardDefaults.cardColors(
                containerColor = if (!isSystemInDarkTheme()) White else MaterialTheme.colorScheme.surface,
                contentColor = MaterialTheme.colorScheme.onBackground
            )
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(id = cardItem.resId),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxHeight(.7f)
                        .fillMaxWidth()
                )
                Text(
                    text = cardItem.caption,
                    style = MaterialTheme.typography.headlineMedium,
                    modifier = Modifier.padding(top = 8.dp, start = 8.dp)
                )
            }
        }
    }
}