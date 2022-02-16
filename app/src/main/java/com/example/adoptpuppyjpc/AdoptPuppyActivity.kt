package com.example.adoptpuppyjpc

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.adoptpuppyjpc.ui.theme.PuppyTheme
import data.Puppy

class AdoptPuppyActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PuppyTheme {
                MyApp {
                    startActivity(PuppyActivity.newIntent(this, it))
                }
            }
        }
    }
}

@Composable
fun MyApp(navigateToPuppy: (Puppy) -> Unit) {
    Scaffold(
        content = {
            PuppyHomeContent(navigateToPuppy = navigateToPuppy)
        }
    )
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PuppyTheme {
        MyApp {}
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DefaultDarkPreview() {
    PuppyTheme {
        MyApp {}
    }
}