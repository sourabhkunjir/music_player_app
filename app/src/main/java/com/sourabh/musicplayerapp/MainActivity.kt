package com.sourabh.musicplayerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sourabh.musicplayerapp.data.songsList
import com.sourabh.musicplayerapp.ui.screens.HomeScreen
import com.sourabh.musicplayerapp.ui.theme.MusicStreamingAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MusicStreamingAppTheme {
                Scaffold(topBar = {
                    TopAppBar(
                        title = { Text(text = "Music Streaming App") },
                        backgroundColor = MaterialTheme.colors.primary
                    )
                }) { innerPadding ->
                    HomeScreen(songsList = songsList,innerPadding)
                }
            }
        }
    }

}