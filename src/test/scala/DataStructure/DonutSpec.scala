package DataStructure

import org.scalatest.{FunSuite, Matchers}

class DonutSpec extends FunSuite with Matchers {

  val glazedDonut = Donut("Glazed Donut", 1111)
  val vanillaDonut = Donut("Vanilla Donut", 2222)

  test("glazedDonut.print should be `Donut name = Glazed Donut, productCode = 1111` ") {
    glazedDonut.print should be("Donut name = Glazed Donut, productCode = 1111")
  }

  test("vanillaDonut.print shoulbe be `Donut name = Vanilla Donut, productCode = 2222`") {
    vanillaDonut.print should be("Donut name = Vanilla Donut, productCode = 2222")
  }

}
