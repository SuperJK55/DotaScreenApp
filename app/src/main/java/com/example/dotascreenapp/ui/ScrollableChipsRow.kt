package com.example.dotascreenapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dotascreenapp.ui.theme.DotaAppTheme

@Composable
fun ScrollableChipsRow(
    items: List<String>,
    modifier: Modifier,
    contentPadding: PaddingValues
)
{
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = contentPadding,
        modifier =  modifier
    ){
        items(items.size) { chipText ->
            Chip(text = items[chipText])
        }
    }
}

@Composable
private fun Chip(text: String) {
    Surface(
        modifier = Modifier
            .height(22.dp),
        color = DotaAppTheme.ChipColor.background,
        shape = RoundedCornerShape(size = 100.dp)
    ) {
        Text(
            text = text,
            style = DotaAppTheme.TextStyle.Mono_10,
            color = DotaAppTheme.TextColor.chip,
            modifier = Modifier.padding(top = 5.dp, bottom = 5.dp, start = 10.dp, end = 10.dp)
        )
    }
}
@Preview
@Composable
fun ScrollableChipsRowPreview(){
    ScrollableChipsRow(
        items = listOf("MOBA", "MULTYPLAYER", "STRATEGY"),
        modifier = Modifier,
        contentPadding = PaddingValues(start = 24.dp, end = 24.dp, top = 20.dp, bottom = 16.dp))
}