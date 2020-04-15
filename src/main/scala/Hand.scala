class Hand {

  def findPokerHand(playersCardArray: Set[Card]) : String = {

    if(isFlush(playersCardArray)) "Flush"
    else if(isFourOfAKind(playersCardArray)) "Four-of-a-kind"
    else if (isFullHouse(playersCardArray)) "Full-House"
    else if (isThreeOfAKind(playersCardArray)) "Three-of-a-kind"
    else if (isPair(playersCardArray)) "Pair"
    else "High-card"
  }

  private def isFlush(playersCardArray : Set[Card]) =
    playersCardArray.groupBy(_.suit).exists(value => value._2.size == 5)

  private def isFourOfAKind(playersCardArray : Set[Card]) =
    playersCardArray.groupBy(_.rank).exists(value => value._2.size == 4)

  private def isThreeOfAKind(playersCardArray : Set[Card]) =
    playersCardArray.groupBy(_.rank).exists(value => value._2.size == 3)

  private def isPair(playersCardArray : Set[Card]) =
    playersCardArray.groupBy(_.rank).exists(value => value._2.size == 2)

  private def isFullHouse(playersCardArray : Set[Card]) =
    isPair(playersCardArray) && isThreeOfAKind(playersCardArray)
}
