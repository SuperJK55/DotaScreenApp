package com.example.dotascreenapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotascreenapp.R

@Composable
fun VideoPreviewRow(
    items: List<Painter>,
    contentPadding: PaddingValues
){
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(15.dp),
        contentPadding = contentPadding
    ) {
        items(items.size) { previewText ->
            Image(
                painter = items[previewText],
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .height(128.dp)
                    .clip(shape = RoundedCornerShape(14.dp))
            )
        }
    }
}

@Preview
@Composable
fun VideoRowPreview(){
    VideoPreviewRow(
        items = listOf(
            painterResource(R.drawable.preview_video_1),
            painterResource(R.drawable.preview_video_1)
        ),
        contentPadding = PaddingValues(start = 24.dp, end = 24.dp)
    )
}