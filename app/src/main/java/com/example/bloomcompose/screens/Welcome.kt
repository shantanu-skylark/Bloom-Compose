package com.example.bloomcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.bloomcompose.R
import com.example.bloomcompose.ui.theme.buttonFontStyle

@Composable
fun Welcome(
    onLogin: () -> Unit
) {
    Box {
        Image(
            painter = if (!isSystemInDarkTheme()) painterResource(id = R.drawable.light_welcome_bg)
            else painterResource(id = R.drawable.dark_welcome_bg),
            contentDescription = "bg",
            Modifier
                .align(Alignment.Center)
                .fillMaxSize(),
            contentScale = ContentScale.FillWidth
        )
        Column {
            Spacer(modifier = Modifier.height(72.dp))
            Image(
                painter = if (!isSystemInDarkTheme()) {
                    painterResource(id = R.drawable.light_welcome_illos)
                } else {
                    painterResource(id = R.drawable.dark_welcome_illos)
                },
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 88.dp)
                    .fillMaxHeight(0.4f),
                alignment = Alignment.CenterStart,
                contentScale = ContentScale.FillHeight
            )
            Spacer(modifier = Modifier.height(48.dp))
            Text(
                text = "Bloom",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Beautiful home garden solutions",
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(40.dp))
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(48.dp)
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.secondary
                )
            ) {
                Text(
                    text = "Create Account",
                    style = buttonFontStyle,
                    color = MaterialTheme.colorScheme.onSecondary
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            TextButton(
                onClick = { onLogin() },
                modifier = Modifier
                    .height(48.dp)
                    .align(Alignment.CenterHorizontally)
                    .padding(horizontal = 16.dp),
            ) {
                Text(
                    text = "Log in",
                    style = buttonFontStyle,
                    color = MaterialTheme.colorScheme.secondary
                )
            }
        }
    }
}