package com.example.dotascreenapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.dotascreenapp.R

@Composable
fun DotaScreenHeader(
    modifier: Modifier = Modifier
) {
    HeaderBackground(
        painter = painterResource(R.drawable.bg_header),
        modifier = modifier.fillMaxWidth()
    )
}
@Composable
private fun HeaderBackground(
    painter: Painter,
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier
        .size(460.dp)
        .fillMaxSize()){
        Image(
            painter = painter,
            contentDescription = "Dota background",
            contentScale = ContentScale.Crop,
            alignment = Alignment.TopCenter,
            modifier = Modifier
                .size(700.dp)
                .fillMaxSize()
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .size(55.dp)
                .align(alignment = Alignment.BottomCenter)
                .background(color = Color(0xff050B18), RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp))
        )
        Row(modifier = Modifier
            .align(Alignment.BottomStart)
            .padding(horizontal = 21.dp)
        ){
            DotaLogo()
        }
    }

}
@Composable
private fun DotaLogo(){
    Box(
        modifier = Modifier
            .size(88.dp)
            .background(Color.Black, RoundedCornerShape(14.dp))
            .border(1.5.dp, Color(0xff1F2430), RoundedCornerShape(14.dp))
    )
    {
        Image(
            painter = painterResource(R.drawable.dota_logo),
            contentDescription = "Dota logo",
            modifier = Modifier
                .fillMaxSize()
                .padding(17.dp)

        )
    }
}