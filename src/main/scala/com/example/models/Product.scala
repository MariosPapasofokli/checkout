package com.example.models

sealed abstract class Product(val name: String, val cost: BigDecimal)

case object Apple extends Product("apple", 0.60)

case object Orange extends Product("orange", 0.25)