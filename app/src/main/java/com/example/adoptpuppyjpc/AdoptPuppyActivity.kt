package com.example.adoptpuppyjpc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.adoptpuppyjpc.ui.theme.PuppyTheme
import data.Puppy
import java.lang.reflect.Modifier

class AdoptPuppyActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PuppyTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    val navController: NavHostController = rememberNavController()
    Scaffold {
        PuppyNavGraph(
            navController = navController
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PuppyTheme {
        MyApp()
    }
}