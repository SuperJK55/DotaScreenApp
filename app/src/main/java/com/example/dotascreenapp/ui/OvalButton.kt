package com.example.dotascreenapp.ui

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.dotascreenapp.ui.theme.DotaAppTheme

@Composable
fun OvalButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier
){
    Button(onClick = { onClick() },
        colors =  ButtonDefaults.buttonColors(
            containerColor = DotaAppTheme.ButtonColor.buttonbg),
        shape = RoundedCornerShape(12.dp),
        modifier = modifier
    )
    {
        Text(
            text = text,
            style = DotaAppTheme.TextStyle.Bold_20,
            color = DotaAppTheme.TextColor.button
        )
    }
}