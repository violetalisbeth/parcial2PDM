package com.vlagtres.pacial2pdm.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.vlagtres.pacial2pdm.viewmodel.ProductViewModel
import com.vlagtres.pacial2pdm.data.model.Product

@Composable
fun ProductListScreen(viewModel: ProductViewModel, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        OutlinedTextField(
            value = viewModel.searchQuery,
            onValueChange = { viewModel.onSearchQueryChanged(it) },
            label = { Text("Buscar por nombre o categoría") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        Column {
            viewModel.productList.forEach { product ->
                ProductCard(product = product) {
                    viewModel.selectProduct(product)
                    navController.navigate("detail")
                }
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}
