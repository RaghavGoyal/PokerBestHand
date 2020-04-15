import org.scalatest.{FunSpec, Matchers}

class MainTest extends FunSpec with Matchers {

  describe("Test For Duplicate Card Entries: "){
    it("Should throw an Exception"){
      assertThrows[IllegalInputException]{
        Main.getBestHand("S2","C3","H3","C2","C2")
      }
    }
  }

  describe("Test For Invalid Card Suit: "){
    it("Should throw an Exception"){
      assertThrows[IllegalInputException]{
        Main.getBestHand("G2","C3","H3","C2","C2")
      }
    }
  }

  describe("Test For Invalid Card Rank: ") {
    it("Should throw an Exception when ") {
      assertThrows[IllegalInputException] {
        Main.getBestHand("S2", "CK", "H3", "C2", "CL")
      }
    }
  }

}
