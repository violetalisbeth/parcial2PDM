package com.vlagtres.pacial2pdm.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.vlagtres.pacial2pdm.ui.screens.*
import com.vlagtres.pacial2pdm.viewmodel.ProductViewModel

@Composable
fun NavGraph(navController: NavHostController, viewModel: ProductViewModel) {
    NavHost(navController, startDestination = "list") {
        composable("list") {
            ProductListScreen(viewModel, navController)
        }
        composable("detail") {
            ProductDetailScreen(viewModel, navController)
        }
        composable("cart") {
            ShoppingCartScreen(viewModel)
        }
    }
}
