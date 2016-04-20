package com.example

import com.example.services.CheckoutServiceImpl

object CheckoutAppWithoutOffers {

  def main(args: Array[String]) = {
    val checkoutService = new CheckoutServiceImpl()
    val products = checkoutService.validateInput(args)
    val totalCost = checkoutService.calculateTotal(products)
    println(s"Total Cost of products: $totalCost")
  }

}
