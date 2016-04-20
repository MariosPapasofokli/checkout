package com.example.services

import com.example.models.{Apple, Orange}
import com.example.services.checkout.CheckoutServiceImplWithOffersImpl
import com.example.services.offer.OfferServiceImpl
import com.example.util.CartUtil._
import org.specs2.mutable.Specification

class CheckoutServiceWithOffersImplTest extends Specification {

  val offerService = new OfferServiceImpl
  val checkoutService = new CheckoutServiceImplWithOffersImpl(offerService)

  "calculateTotal function should" >> {

    "return 0 for empty cart" >> {
      checkoutService.calculateTotal(cart0) must_== 0
    }

    "calculate cost for a mixed cart" >> {
      checkoutService.calculateTotal(cart1) must_== Apple.cost * 2 + Orange.cost * 4
    }

    "calculate cost for a cart with only apples" >> {
      checkoutService.calculateTotal(cart2) must_== Apple.cost * 2
    }

    "calculate cost for a cart with only oranges" >> {
      checkoutService.calculateTotal(cart3) must_== Orange.cost * 4
    }

    "calculate cost for a mixed cart with many products" >> {
      checkoutService.calculateTotal(cart4) must_== Apple.cost * 3 + Orange.cost * 5
    }

  }

}
