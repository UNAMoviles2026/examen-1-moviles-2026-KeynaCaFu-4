package com.moviles.examenmoviles.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.moviles.examenmoviles.ui.screens.CoworkingDetailScreen
import com.moviles.examenmoviles.ui.screens.CoworkingListScreen

sealed class Screen(val route: String) {
    object List : Screen("list")
    object Detail : Screen("detail/{spaceId}") {
        fun createRoute(spaceId: String) = "detail/$spaceId"
    }
}

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.List.route
    ) {
        composable(Screen.List.route) {
            CoworkingListScreen(
                onSpaceClick = { spaceId ->
                    navController.navigate(Screen.Detail.createRoute(spaceId))
                }
            )
        }
        composable(Screen.Detail.route) { backStackEntry ->
            val spaceId = backStackEntry.arguments?.getString("spaceId")
            CoworkingDetailScreen(
                spaceId = spaceId,
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}
