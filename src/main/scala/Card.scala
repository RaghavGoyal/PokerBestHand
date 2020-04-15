case class Card(suit:String, rank:String) {

  def this(){
    this("","")
  }

  def parseCard(card:String): Card ={
    Card(card(0).toString,card(1).toString)
  }

}
