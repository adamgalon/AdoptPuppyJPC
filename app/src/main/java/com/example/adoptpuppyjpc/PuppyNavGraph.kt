package com.example.adoptpuppyjpc

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.adoptpuppyjpc.screens.PuppyDetailScreen
import com.example.adoptpuppyjpc.screens.PuppyHomeScreen
import data.FakePuppyData


@Composable
fun PuppyNavGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.PuppyHomeScreen.route
    ) {
        composable(
            route = Screen.PuppyHomeScreen.route
        ) {
            PuppyHomeScreen(navController)
        }
        composable(
            route = Screen.PuppyDetailScreen.route,
            arguments = listOf(navArgument("id") {
                type = NavType.IntType
            })
        ) {
            Log.e("arg", "Nav " + it.arguments?.getInt("id").toString())
            PuppyDetailScreen(FakePuppyData.puppyList[it.arguments!!.getInt("id")])
        }
    }
}