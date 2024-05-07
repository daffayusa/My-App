package com.example.myapp.navigation

sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object Gallery: Screen("gallery")
    data object Album: Screen("album")
    data object Detail: Screen("detail_members")
    data object About: Screen("about")
}