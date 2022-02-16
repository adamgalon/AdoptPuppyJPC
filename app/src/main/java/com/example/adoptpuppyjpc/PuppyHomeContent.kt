package com.example.adoptpuppyjpc

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import data.FakePuppyData
import data.Puppy

@Composable
fun PuppyHomeContent(navigateToPuppy: (Puppy) -> Unit) {

    val puppies = remember { FakePuppyData.puppyList }

    LazyColumn(contentPadding = PaddingValues(16.dp, 8.dp)) {
        items(
            items = puppies,
            itemContent = {
                PuppyListItem(
                    puppy = it,
                    navigateToPuppy = navigateToPuppy
                )
            }
        )
    }
}

@Preview
@Composable
fun PreviewPuppyHomeContent() {
    PuppyHomeContent({})
}