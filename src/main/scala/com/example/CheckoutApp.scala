package com.example

import com.example.services.checkout.CheckoutServiceImplWithOffersImpl
import com.example.services.offer.OfferServiceImpl

object CheckoutApp {

  def main(args: Array[String]) = {
    val offerService = new OfferServiceImpl
    val checkoutService = new CheckoutServiceImplWithOffersImpl(offerService)
    val products = checkoutService.validateInput(args)
    val totalCost = checkoutService.calculateTotal(products)
    println(s"Total Cost of products: $totalCost")
  }

}
