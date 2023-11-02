package com.example.dotascreenapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotascreenapp.R
import com.example.dotascreenapp.ui.theme.DotaAppTheme

@Composable
fun RatingBlock(
    rating: Float,
    reviewsCount: String,
    modifier: Modifier
){
    Row(modifier = modifier){
        Text(
            text = rating.toString(),
            style = DotaAppTheme.TextStyle.Bold_48,
            color = DotaAppTheme.TextColor.primary
        )
        Column(modifier = Modifier
            .align(Alignment.CenterVertically)
            .width(100.dp)

            .padding(horizontal = 10.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                repeat(5){
                    Image(
                        painter = painterResource(R.drawable.rating_star),
                        contentDescription = "rating star",
                        modifier = Modifier.size(12.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.size(5.dp))
            Text(
                text = "$reviewsCount Reviews",
                style = DotaAppTheme.TextStyle.Regular_12,
                color = DotaAppTheme.TextColor.reviewstext
            )
        }
    }
}
@Preview
@Composable
fun RatingBlockPreview(){
    RatingBlock(rating = 4.9f,
        reviewsCount = "70M",
        modifier = Modifier.padding(
            start = 24.dp,
            end = 24.dp,
            bottom = 16.dp
        )
    )
}