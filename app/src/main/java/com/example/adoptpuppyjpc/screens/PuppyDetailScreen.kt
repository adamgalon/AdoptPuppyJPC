package com.example.adoptpuppyjpc.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import data.FakePuppyData
import data.Puppy


@Composable
fun PuppyDetailScreen(puppy: Puppy) {
    val scrollState = rememberScrollState()

    Column(modifier = Modifier.fillMaxSize()) {
        BoxWithConstraints {
            Surface {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(scrollState)
                ) {
                    PuppyHeader(
                        puppy = puppy,
                        containerHeight = this@BoxWithConstraints.maxHeight
                    )
                    PuppyContent(
                        puppy = puppy,
                        containerHeight = this@BoxWithConstraints.maxHeight
                    )

                }
            }
        }
    }

}


@Composable
fun PuppyHeader(puppy: Puppy, containerHeight: Dp) {
    Image(
        painter = painterResource(id = puppy.puppyImageId),
        contentScale = ContentScale.Crop,
        contentDescription = "PuppyScreenImg",
        modifier = Modifier
            .heightIn(max = containerHeight / 2)
            .fillMaxWidth()
    )
}

@Composable
fun PuppyContent(puppy: Puppy, containerHeight: Dp) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = puppy.title,
            style = MaterialTheme.typography.h5,
            fontWeight = FontWeight.Bold

        )
        PuppyProperty(label = "Gender", value = puppy.gender)
        PuppyProperty(label = "Age", value = puppy.age.toString())
        PuppyProperty(label = "Description", value = puppy.description)
    }
    Spacer(modifier = Modifier.height((containerHeight - 450.dp).coerceAtLeast(0.dp)))

}

@Composable
fun PuppyProperty(
    label: String, value: String
) {
    Column(modifier = Modifier.padding(16.dp)) {
        Divider(modifier = Modifier.padding(bottom = 6.dp))
        Text(
            text = label,
            style = MaterialTheme.typography.caption,
            modifier = Modifier.height(25.dp)
        )
        Text(
            text = value,
            style = MaterialTheme.typography.body1,
            modifier = Modifier.height(25.dp),
            overflow = TextOverflow.Visible
        )
    }
}


@Preview()
@Composable
fun PreviewPuppyScreen() {
    val puppy = FakePuppyData.puppy
    PuppyDetailScreen(puppy = puppy)
}










