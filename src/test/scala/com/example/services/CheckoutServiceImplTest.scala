package com.example.services

import com.example.models._
import com.example.services.checkout.CheckoutServiceImpl
import com.example.util.CartUtil._
import org.specs2.mutable.Specification

class CheckoutServiceImplTest extends Specification {

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

    "calculate cost for a mixed cart with many products" >> {
      checkoutService.calculateTotal(cart4) must_== Apple.cost * 5 + Orange.cost * 7
    }


  }

}