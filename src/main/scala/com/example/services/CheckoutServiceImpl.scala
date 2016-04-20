package com.example.services

import com.example.models.Product

class CheckoutServiceImpl extends CheckoutService {

  /** *
    * Calculates the total cost of the products
    */
  override def calculateTotal(products: Seq[Product]): BigDecimal = products.map(_.cost).sum

}
