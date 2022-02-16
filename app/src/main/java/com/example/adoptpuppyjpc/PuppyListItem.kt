package com.example.adoptpuppyjpc

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import data.FakePuppyData
import data.Puppy

@Composable
fun PuppyListItem(
    puppy: Puppy,
    navigateToPuppy: (Puppy) -> Unit
) {
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, 8.dp)
            .fillMaxWidth(),
        elevation = 2.dp,
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        Row(Modifier.clickable { navigateToPuppy(puppy) }) {
            PuppyImage(puppy = puppy)
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = puppy.title, style = MaterialTheme.typography.h6)
                Text(text = "View Details", style = MaterialTheme.typography.caption)
            }
        }
    }
}


@Composable
fun PuppyImage(puppy: Puppy) {
    Image(
        painter = painterResource(id = puppy.puppyImageId),
        contentDescription = "PuppyImage",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(80.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}

@Preview
@Composable
fun PreviewPuppyItem() {
    val puppy = FakePuppyData.puppy
    PuppyListItem(puppy = puppy, {})
}