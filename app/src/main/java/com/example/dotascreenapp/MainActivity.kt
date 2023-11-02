package com.example.dotascreenapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.example.dotascreenapp.ui.theme.DotaScreenAppTheme
import com.example.dotascreenapp.ui.theme.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window,false)
        setContent {
            DotaScreenAppTheme {
                MainScreen()
            }
        }
    }
}
