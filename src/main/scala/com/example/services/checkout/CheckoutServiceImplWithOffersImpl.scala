package com.example.services.checkout

import com.example.models.Product
import com.example.services.offer.OfferService

class CheckoutServiceImplWithOffersImpl(offerService: OfferService) extends CheckoutService {

  /** *
    * Calculates the total cost of the products by apply the discount as well
    */
  override def calculateTotal(products: Seq[Product]): BigDecimal = products.map(_.cost).sum - offerService.discount(products)
}
