package com.example.util

import com.example.models.{Apple, Orange}

object CartUtil {
  val cart0 = Seq.empty
  val cart1 = List(Apple, Apple, Apple, Orange, Orange, Orange, Orange, Orange)
  val cart2 = List(Apple, Apple, Apple)
  val cart3 = List(Orange, Orange, Orange, Orange, Orange)
  val cart4 = List(Apple, Apple, Apple, Apple, Apple, Orange, Orange, Orange, Orange, Orange, Orange, Orange)
}
