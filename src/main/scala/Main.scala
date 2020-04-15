object Main extends App {

  println(Constants.WELCOME_MSG)

  println("Enter the 5 cards: (Separated by space)")

  val input = scala.io.StdIn.readLine("prompt> ")
  val refinedInput = input.trim.toUpperCase.split(" ")

  getBestHand(refinedInput(0),refinedInput(1),refinedInput(2),refinedInput(3),refinedInput(4))

  def getBestHand(a:String, b:String, c:String, d:String, e:String) = {
    val cardNames = Array(a,b,c,d,e).toSet

    if(cardNames.size < Constants.INPUT_SIZE) throw IllegalInputException("You Entered Duplicate Cards!")

    val playersCardArray : Set[Card] = for{
      card <- cardNames
    }yield new Card().parseCard(card)

   if(!playersCardArray.forall(card => Constants.SUITS.toSet.contains(card.suit)))throw IllegalInputException("Illegal Suit Input")
   if(!playersCardArray.forall(card => Constants.RANKS.toSet.contains(card.rank)))throw IllegalInputException("Illegal Rank input!")

    val hand = new Hand
    println("Poker Result: " + hand.findPokerHand(playersCardArray))
  }

}
