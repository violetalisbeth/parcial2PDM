package com.vlagtres.pacial2pdm.viewmodel

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import com.vlagtres.pacial2pdm.R
import com.vlagtres.pacial2pdm.data.model.Product

class ProductViewModel : ViewModel() {
    private val _products = listOf(
        Product(1, "Camisa", "Ropa", 19.99, "Laptop con 16GB RAM", R.drawable.laptop),
        Product(2, "Pantalón", "Ropa", 29.99, "Camisa cómoda y fresca", R.drawable.camisa),
        Product(3, "Zapatos", "Calzado", 49.99, "Mouse RGB para gaming", R.drawable.mouse),
        Product(4, "Bolso", "Accesorio", 39.99, "Ideales para correr", R.drawable.zapato)
    )

    var searchQuery by mutableStateOf("")
        private set

    var selectedProduct: Product? by mutableStateOf(null)
        private set

    var cartItems by mutableStateOf(listOf<Product>())
        private set

    val productList: List<Product>
        get() = if (searchQuery.isBlank()) _products
        else _products.filter {
            it.name.contains(searchQuery, ignoreCase = true) ||
                    it.category.contains(searchQuery, ignoreCase = true)
        }

    fun onSearchQueryChanged(query: String) {
        searchQuery = query
    }

    fun selectProduct(product: Product) {
        selectedProduct = product
    }

    fun addToCart(product: Product) {
        cartItems = cartItems + product
    }

    fun removeFromCart(product: Product) {
        cartItems = cartItems - product
    }
}
