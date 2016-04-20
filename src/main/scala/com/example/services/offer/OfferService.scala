package com.example.services.offer

import com.example.models.Product

trait OfferService {

  /**
    * Returns the applicable discount depending on the [[Product]] type
    */
  def discount(products: Seq[Product]): BigDecimal
}