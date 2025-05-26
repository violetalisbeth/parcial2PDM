package com.vlagtres.pacial2pdm.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.vlagtres.pacial2pdm.viewmodel.ProductViewModel

@Composable
fun ShoppingCartScreen(viewModel: ProductViewModel) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Carrito de Compras") }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues) // respeta el padding del Scaffold
                .padding(16.dp) // padding interno personalizado
        ) {
            if (viewModel.cartItems.isEmpty()) {
                Text("Tu carrito está vacío.", style = MaterialTheme.typography.bodyLarge)
            } else {
                viewModel.cartItems.forEach {
                    Text("${it.name} - $${it.price}", style = MaterialTheme.typography.bodyLarge)
                    Spacer(modifier = Modifier.height(4.dp))
                }
            }
        }
    }
}
