package com.example.services.offer

import com.example.models._


class OfferServiceImpl extends OfferService {

  /**
    * Returns the applicable discount depending on the [[Product]] type
    */
  def discount(products: Seq[Product]): BigDecimal = {
    val groupedByType: Map[Product, Seq[Product]] = products.groupBy(identity)
    groupedByType.map {
      case (Apple, seq) => BuyOneGetOneFree.discount(Apple, seq.size)
      case (Orange, seq) => BuyThreeGetOneFree.discount(Orange, seq.size)
    }.sum

  }

}
