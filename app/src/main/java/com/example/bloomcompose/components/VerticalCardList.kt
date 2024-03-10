package com.example.bloomcompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.bloomcompose.R
import com.example.bloomcompose.data.ListCardItem

@Composable
fun VerticalCardList(cardItems: List<ListCardItem>) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 32.dp, start = 16.dp),

        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Design your home garden",
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.onBackground
        )
        Icon(
            modifier = Modifier.padding(end = 16.dp),
            painter = painterResource(id = R.drawable.baseline_filter_list_24),
            contentDescription = "Filter"
        )
    }
    Column(modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp, bottom = 56.dp)) {
        cardItems.forEachIndexed { index, cardItem ->
            CardItem(isSelected = index == 0, cardItem = cardItem)
            Spacer(Modifier.size(8.dp))
        }
    }
}

@Composable
private fun CardItem(cardItem: ListCardItem, isSelected: Boolean = false) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(64.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Image(
            painter = painterResource(cardItem.resId),
            contentDescription = cardItem.caption,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(64.dp)
                .clip(MaterialTheme.shapes.small)
        )
        Column(
            modifier = Modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(text = cardItem.caption, style = MaterialTheme.typography.headlineMedium)
                    Text(text = "This is a description", style = MaterialTheme.typography.bodyLarge)
                }
                Checkbox(
                    checked = isSelected,
                    onCheckedChange = {},
                    colors = CheckboxDefaults.colors(
                        checkedColor = MaterialTheme.colorScheme.secondary,
                        checkmarkColor = MaterialTheme.colorScheme.onSecondary
                    )
                )
            }
            Divider()
        }
    }
}