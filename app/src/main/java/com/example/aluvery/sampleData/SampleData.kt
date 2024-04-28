package com.example.aluvery.sampleData

import br.com.alura.aluvery.model.Product
import com.example.aluvery.R
import java.math.BigDecimal

val sampleProducts = listOf(
    Product("Hamburguer", BigDecimal(12.99), R.drawable.burger),
    Product("Fritas", BigDecimal(10.00), R.drawable.fries),
    Product("Pizza", BigDecimal(39.50), R.drawable.pizza)
)