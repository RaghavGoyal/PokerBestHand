import org.scalatest.{FunSpec, Matchers}

class HandTest extends FunSpec with Matchers {

  describe("If all cards belongs to same suit"){
    it("should result in Flush"){
      val testCards =  Array(Card("S","A"),Card("S","K"), Card("S","T"), Card("S","8"), Card("S","2")).toSet
      val handObj = new Hand
      handObj.findPokerHand(testCards) should be("Flush")
    }
  }

  describe("If 4 cards belongs to same rank"){
    it("should result in Four-of-a-kind"){
      val testCards =  Array(Card("S","A"),Card("C","A"), Card("H","A"), Card("D","A"), Card("S","2")).toSet
      val handObj = new Hand
      handObj.findPokerHand(testCards) should be("Four-of-a-kind")
    }
  }

  describe("If 3 cards belongs to same rank and other 2 cards belong to another Rank"){
    it("should result in Full-House"){
      val testCards =  Array(Card("S","J"),Card("H","J"), Card("C","A"), Card("D","A"), Card("S","A")).toSet
      val handObj = new Hand
      handObj.findPokerHand(testCards) should be("Full-House")
    }
  }

  describe("If 3 cards belongs to same rank"){
    it("should result in Three-of-a-Kind"){
      val testCards =  Array(Card("C","A"),Card("H","A"), Card("S","T"), Card("D","T"), Card("D","A")).toSet
      val handObj = new Hand
      handObj.findPokerHand(testCards) should be("Three-of-a-kind")
    }
  }

  describe("If 2 cards belongs to same rank"){
    it("should result in Pair"){
      val testCards =  Array(Card("C","A"),Card("H","A"), Card("S","T"), Card("D","T"), Card("D","K")).toSet
      val handObj = new Hand
      handObj.findPokerHand(testCards) should be("Pair")
    }
  }

  describe("If all cards belongs to different rank"){
    it("should result in High-card"){
      val testCards =  Array(Card("C","A"),Card("H","K"), Card("S","7"), Card("D","T"), Card("D","5")).toSet
      val handObj = new Hand
      handObj.findPokerHand(testCards) should be("High-card")
    }
  }

}
