package com.example.bloomcompose.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.bloomcompose.R
import com.example.bloomcompose.ui.theme.Pink100
import com.example.bloomcompose.ui.theme.Pink900

@Composable
fun BottomNavBar() {
    BottomAppBar(
        tonalElevation = 16.dp,
        containerColor = MaterialTheme.colorScheme.primary,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            BottomBarItem(tabName = "Home", resId = R.drawable.baseline_home_24)
            BottomBarItem(tabName = "Favorites", resId = R.drawable.baseline_favorite_border_24)
            BottomBarItem(tabName = "Profile", resId = R.drawable.baseline_account_circle_24)
            BottomBarItem(tabName = "Cart", resId = R.drawable.baseline_shopping_cart_24)
        }
    }
}

@Composable
fun BottomBarItem(tabName: String, @DrawableRes resId: Int) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            painter = painterResource(id = resId),
            contentDescription = null,
            modifier = Modifier.requiredSize(24.dp),
            tint = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = tabName,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}