package com.example.bloomcompose.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomInput(
    label: String,
    icon: Int?,
    modifier: Modifier = Modifier
) {

    OutlinedTextField(
        modifier = modifier.fillMaxWidth(.9f),
        value = TextFieldValue(),
        onValueChange = {},
        label = { Text(text = label) },
        leadingIcon = icon?.let {
            {
                Icon(
                    painter = painterResource(id = it),
                    contentDescription = "Search"
                )
            }
        },
        textStyle = MaterialTheme.typography.bodyMedium,
        singleLine = true,
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = MaterialTheme.colorScheme.onBackground,
            focusedBorderColor = MaterialTheme.colorScheme.onSurface,
            focusedLabelColor = MaterialTheme.colorScheme.onBackground,
            unfocusedLabelColor = MaterialTheme.colorScheme.onBackground,
            cursorColor = MaterialTheme.colorScheme.onBackground
        )
    )
}