package com.example.dotascreenapp.ui

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.dotascreenapp.Comment.comments
import com.example.dotascreenapp.R
import com.example.dotascreenapp.ui.theme.DotaAppTheme

@Composable
fun DotaScreen() {
    val context = LocalContext.current
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xff050B18))){
        item{
            DotaScreenHeader()
        }
        item{
            ScrollableChipsRow(
                items = listOf("MOBA", "MULTYPLAYER", "STRATEGY"),
                modifier = Modifier,
                contentPadding = PaddingValues(start = 24.dp, end = 24.dp, top = 20.dp, bottom = 16.dp))
        }
        item{
            Text(
                text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
                style = DotaAppTheme.TextStyle.Regular_12_19,
                color = DotaAppTheme.TextColor.maintext,
                modifier = Modifier.padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 14.dp,
                    bottom = 14.dp
                )
            )
        }
        item {
            VideoPreviewRow(
                items = listOf(
                    painterResource(R.drawable.preview_video_1),
                    painterResource(R.drawable.preview_video_2)
                ),
                contentPadding = PaddingValues(start = 24.dp, end = 24.dp)
            )
        }
        item{
            Text(
                text = "Review & Ratings",
                style = DotaAppTheme.TextStyle.Bold_16,
                color = DotaAppTheme.TextColor.reviewratings,
                modifier = Modifier.padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 20.dp,
                    bottom = 12.dp
                )

            )
        }
        item{
            RatingBlock(rating = 4.9f,
                reviewsCount = "70M",
                modifier = Modifier.padding(
                    start = 24.dp,
                    end = 24.dp,
                    bottom = 16.dp
                )
            )
        }
        itemsIndexed(comments) { index, item ->
            CommentBlock(
                item,
                modifier = Modifier
                    .padding(
                        start = 24.dp,
                        end = 24.dp,
                        top = 16.dp
                    )
            )
            if (index < comments.lastIndex) {
                Divider(
                    color = DotaAppTheme.DividerColors.divider,
                    thickness = 1.dp,
                    modifier = Modifier
                        .padding(
                            top = 12.dp,
                            bottom = 10.dp,
                            start = 38.dp,
                            end = 38.dp
                        )
                )
            }
        }
        item {
            OvalButton(
                text = "Install",
                onClick = {
                    Toast.makeText( context,"CLICKED", Toast.LENGTH_LONG).show()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 24.dp,
                        end = 24.dp,
                        top = 20.dp,
                        bottom = 40.dp)
                    .height(64.dp)
            )
        }
    }
}