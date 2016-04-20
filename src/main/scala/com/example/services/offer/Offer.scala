package com.example.services.offer

import com.example.models.Product

/**
  * Represents an offer that can be applied on a product
  */
sealed trait Offer {
  def discount(product: Product, quantity: Int): BigDecimal
}

case object BuyOneGetOneFree extends Offer {
  override def discount(product: Product, quantity: Int) = (quantity / 2) * product.cost
}

case object BuyThreeGetOneFree extends Offer {
  override def discount(product: Product, quantity: Int) = (quantity / 3) * product.cost
}
