package com.example.services

import com.example.models._

class CheckoutServiceImplTest extends org.specs2.mutable.Specification {

  val cart0 = Seq.empty
  val cart1 = List(Apple, Apple, Apple, Orange, Orange, Orange, Orange, Orange)
  val cart2 = List(Apple, Apple, Apple)
  val cart3 = List(Orange, Orange, Orange, Orange, Orange)

  val checkoutService = new CheckoutServiceImpl

  "calculateTotal function should" >> {

    "return 0 for empty cart" >> {
      checkoutService.calculateTotal(cart0) must_== 0
    }

    "calculate cost for a mixed cart" >> {
      checkoutService.calculateTotal(cart1) must_== Apple.cost * 3 + Orange.cost * 5
    }

    "calculate cost for a cart with only apples" >> {
      checkoutService.calculateTotal(cart2) must_== Apple.cost * 3
    }

    "calculate cost for a cart with only oranges" >> {
      checkoutService.calculateTotal(cart3) must_== Orange.cost * 5
    }

  }

}