package com.example.services

import com.example.models.{Apple, Orange}
import com.example.services.offer.OfferServiceImpl
import com.example.util.CartUtil._
import org.specs2.mutable.Specification

class OfferServiceImplTest extends Specification {

  val offerService = new OfferServiceImpl

  "discount function should" >> {

    "return 0 for empty cart" >> {
      offerService.discount(cart0) must_== 0
    }

    "calculate discount for a mixed cart" >> {
      offerService.discount(cart1) must_== Apple.cost + Orange.cost
    }

    "calculate discount for a cart with only apples" >> {
      offerService.discount(cart2) must_== Apple.cost
    }

    "calculate discount for a cart with only oranges" >> {
      offerService.discount(cart3) must_== Orange.cost
    }

    "calculate discount for a mixed cart with many products" >> {
      offerService.discount(cart4) must_== Apple.cost * 2 + Orange.cost * 2
    }

  }


}
