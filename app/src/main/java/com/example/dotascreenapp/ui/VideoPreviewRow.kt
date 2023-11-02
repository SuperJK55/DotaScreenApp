package com.example.dotascreenapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotascreenapp.R
import com.example.dotascreenapp.ui.theme.DotaAppTheme

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
            Box(){
                Image(
                    painter = items[previewText],
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .height(128.dp)
                        .clip(shape = RoundedCornerShape(14.dp))
                )
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = DotaAppTheme.BgColors.bgplay,
                        contentColor = DotaAppTheme.BgColors.primaryplay
                    ),
                    shape = CircleShape,
                    contentPadding = PaddingValues(1.dp),
                    modifier = Modifier
                        .size(48.dp)
                        .align(alignment = Alignment.Center)

                ) {
                    Icon(
                        Icons.Rounded.PlayArrow,
                        contentDescription = "Play",
                    )
                }
            }

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