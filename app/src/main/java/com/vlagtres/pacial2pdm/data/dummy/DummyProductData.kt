package com.vlagtres.pacial2pdm.data.dummy

import com.vlagtres.pacial2pdm.R
import com.vlagtres.pacial2pdm.data.model.Product

object DummyProductData {
    val productList = listOf(
        Product(1, "Laptop HP", "Tecnología", 999.99, "Laptop con 16GB RAM", R.drawable.laptop),
        Product(2, "Camisa Casual", "Ropa", 25.50, "Camisa cómoda y fresca", R.drawable.camisa),
        Product(3, "Mouse Gamer", "Tecnología", 49.99, "Mouse RGB para gaming", R.drawable.mouse),
        Product(4, "Zapatos Running", "Calzado", 89.90, "Ideales para correr", R.drawable.zapato)
    )
}
