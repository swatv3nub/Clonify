package com.example.android.composable

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    var route: String,
    var title: String,
    var icon: ImageVector
) {
    object MainScreen : BottomBarScreen(
        route = "MainScreen",
        title = "Home",
        icon = Icons.Default.Home
    )
    object Search : BottomBarScreen(
        route = "Search",
        title = "Search",
        icon = Icons.Default.Search
    )
    object Library : BottomBarScreen(
        route = "Library",
        title = "Library",
        icon = Icons.Default.List
    )
}
