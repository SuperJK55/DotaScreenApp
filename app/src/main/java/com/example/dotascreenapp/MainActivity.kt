package com.example.dotascreenapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.dotascreenapp.ui.theme.DotaScreenAppTheme
import com.example.dotascreenapp.ui.theme.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DotaScreenAppTheme {
                MainScreen()
            }
        }
    }
}
