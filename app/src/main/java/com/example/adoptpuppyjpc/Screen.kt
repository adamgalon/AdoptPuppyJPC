package com.example.adoptpuppyjpc

const val DETAIL_ARGUMENT_ID = "id"

sealed class Screen(val route: String) {
    object PuppyHomeScreen : Screen(route = "puppy_home_screen")
    object PuppyDetailScreen : Screen(route = "puppy_details_screen/{$DETAIL_ARGUMENT_ID}") {
        fun passId(id: Int): String {
            return "puppy_details_screen/$id"
        }
    }
}