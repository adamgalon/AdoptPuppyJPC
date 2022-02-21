package com.example.adoptpuppyjpc.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.adoptpuppyjpc.Screen
import data.FakePuppyData
import data.Puppy

@Composable
fun PuppyHomeScreen(
    navController: NavHostController
//    navigateToPuppy: (Puppy) -> Unit
) {
    val puppies = remember { FakePuppyData.puppyList }

    LazyColumn(contentPadding = PaddingValues(16.dp, 8.dp)) {
        items(
            items = puppies,
            itemContent = { puppy ->
                PuppyListItem(
                    puppy = puppy,
                    navigateToPuppy = {
                        Log.e("arg", puppy.id.toString())
                        navController.navigate(route = Screen.PuppyDetailScreen.passId(puppy.id-1))
                    }
                )
            }
        )
    }
}

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
                Text(text = puppy.title, style = typography.h6)
                Text(text = "View Details", style = typography.caption)
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

/*
@Preview
@Composable
fun PreviewPuppyHomeContent() {
    PuppyHomeScreen({})
}*/
