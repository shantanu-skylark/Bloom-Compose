package com.example.bloomcompose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bloomcompose.screens.Home
import com.example.bloomcompose.screens.Login
import com.example.bloomcompose.screens.Welcome
import com.example.bloomcompose.ui.theme.BloomComposeTheme
import com.example.bloomcompose.ui.theme.Gray
import com.example.bloomcompose.ui.theme.Pink100

class WelcomeActivity : ComponentActivity() {
    @OptIn(ExperimentalComposeUiApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BloomComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = if (isSystemInDarkTheme()) Gray else Pink100
                ) {
                    App()
                }
            }
        }
    }
}

@ExperimentalComposeUiApi
@Composable
fun App() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "welcome") {
        composable("welcome") {
            Welcome(
                onLogin = {
                    navController.navigate("login")
                }
            )
        }
        composable("login") {
            Login(
                onLogin = {
                    navController.navigate("home")
                }
            )
        }
        composable("home") {
            Home()
        }
    }
}


@OptIn(ExperimentalComposeUiApi::class)
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BloomComposeTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.primaryContainer
        ) {
            App()
        }
    }
}