package com.example.services.checkout

import com.example.models.{Apple, Orange, Product}

trait CheckoutService {

  /** *
    * Calculates the total cost of the products
    */
  def calculateTotal(products: Seq[Product]): BigDecimal

  /**
    * Validate sequence of strings to valid Seq[[Product]]
    */
  def validateInput(scanned: Seq[String]): Seq[Product] = scanned.map(_.toLowerCase).flatMap {
    case Apple.name => Some(Apple)
    case Orange.name => Some(Orange)
    case _ => None
  }

}
