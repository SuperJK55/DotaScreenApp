package com.example.dotascreenapp.ui

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun OvalButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier
){
    Button(onClick = { onClick() },
        colors =  ButtonDefaults.buttonColors(
            containerColor = Color(0xFFF4D144),
            contentColor = Color.Black,
            disabledContainerColor = Color(0xFFF4D144),
            disabledContentColor = Color(0xFFF4D144)
        ),
        modifier = modifier
    )
    {
        Text(text = text, color = Color.Black)
    }
}