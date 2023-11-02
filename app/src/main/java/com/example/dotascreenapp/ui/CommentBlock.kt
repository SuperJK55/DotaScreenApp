package com.example.dotascreenapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotascreenapp.Comment.CommentUi
import com.example.dotascreenapp.Comment.comments
import com.example.dotascreenapp.ui.theme.DotaAppTheme

@Composable
fun CommentBlock(
    commentUi: CommentUi,
    modifier: Modifier
) {
    Column(modifier = modifier) {
        Row{
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .size(36.dp)
            ){
                Image(
                    painter = painterResource(commentUi.user.photo),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
            Column(modifier = Modifier
                .padding(start = 16.dp),
                verticalArrangement = Arrangement.spacedBy(5.dp)
            ) {
                Text(
                    text = commentUi.user.name,
                    style = DotaAppTheme.TextStyle.Regular_16,
                    color = DotaAppTheme.TextColor.primary
                )
                Text(
                    text = commentUi.comment.date,
                    style = DotaAppTheme.TextStyle.Regular_12,
                    color = DotaAppTheme.TextColor.date
                )
            }
        }
        Box(modifier = Modifier.padding(top = 16.dp, bottom = 16.dp)){
            Text(
                text = commentUi.comment.text,
                style = DotaAppTheme.TextStyle.Regular_12_20,
                color = DotaAppTheme.TextColor.comment
            )
        }
    }
}

@Preview
@Composable
fun CommentBlockPreview(){
    CommentBlock(commentUi = comments[0], modifier = Modifier)
}