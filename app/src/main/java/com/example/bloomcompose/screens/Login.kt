package com.example.bloomcompose.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.bloomcompose.components.CustomInput
import com.example.bloomcompose.ui.theme.BloomTypography
import com.example.bloomcompose.ui.theme.buttonFontStyle


@Composable
fun Login(
    onLogin: () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "Log in with email",
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .align(Alignment.CenterHorizontally),
            style = BloomTypography.headlineLarge,
            color = MaterialTheme.colorScheme.onBackground
        )
        Spacer(modifier = Modifier.height(16.dp))
        CustomInput(
            "Email address", icon = null,
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        CustomInput(
            "Password (8+ characters)", icon = null,
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "By clicking below, you agree to our Terms of Use and consent to our Privacy Policy",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(horizontal = 16.dp),
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onBackground
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { onLogin() },
            modifier = Modifier
                .height(48.dp)
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.secondary
            )
        ) {
            Text(
                text = "Log in",
                style = buttonFontStyle,
                color = MaterialTheme.colorScheme.onSecondary
            )
        }
    }
}