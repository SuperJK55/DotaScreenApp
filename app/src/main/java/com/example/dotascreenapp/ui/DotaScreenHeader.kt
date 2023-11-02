package com.example.dotascreenapp.ui

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotascreenapp.R
import com.example.dotascreenapp.ui.theme.DotaAppTheme

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
                .background(
                    color = DotaAppTheme.BgColors.background,
                    RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp)
                )
        )
        Row(modifier = Modifier
            .align(Alignment.BottomStart)
            .padding(horizontal = 21.dp)
        ){
            DotaLogo()
            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp),
                modifier = Modifier
                    .padding(
                        top = 40.dp,
                        start = 14.dp
                    )
            ) {
                Text(
                    text = stringResource(R.string.title),
                    style = DotaAppTheme.TextStyle.Bold_20_26,
                    color = DotaAppTheme.TextColor.primary
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()) {
                    Row(
                        modifier = Modifier.width(80.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        repeat(5){
                            Image(
                                painter = painterResource(R.drawable.rating_star),
                                contentDescription = "rating star",
                                modifier = Modifier.size(12.dp)
                            )
                        }
                    }
                    Text(
                        text = stringResource(R.string.reviews),
                        style = DotaAppTheme.TextStyle.Regular_12,
                        color = DotaAppTheme.TextColor.ratingheader,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
            }
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

@Preview
@Composable
fun DotaScreenHeaderPreview(){
    DotaScreenHeader()
}