package com.example.services

import com.example.models._
import com.example.services.checkout.CheckoutServiceImpl
import org.specs2.mutable.Specification

class CheckoutServiceTest extends Specification {

  val input0 = Nil
  val input1 = List("apple", "APPLE", "orange", "orAnge", "orange")
  val input2 = List("pineapple", "berry")

  val checkoutService = new CheckoutServiceImpl

  "validateInput method should" >> {

    "handle empty seq" >> {
      checkoutService.validateInput(input0) must_== Nil
    }

    "validate a mixed seq of input strings with uppercase and lower case characters in strings" >> {
      checkoutService.validateInput(input1) must_== List(Apple, Apple, Orange, Orange, Orange)
    }

    "ignore non valid strings" >> {
      checkoutService.validateInput(input2) must_== Nil
    }
  }

}