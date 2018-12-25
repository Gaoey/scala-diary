package FP.HigherOrderFunctions

import org.scalatest.{FunSuite, Matchers}

class SortSpec extends FunSuite with Matchers {
  test("isSorted(Array(1, 3, 5, 7), (x: Int, y: Int) => x > y) should be  true") {
    Sort.isSorted(Array(1, 3, 5, 7), (x: Int, y: Int) => x > y) should be(true)
  }

  test("isSorted(Array(7, 5, 1, 3), (x: Int, y: Int) => x < y) should be false") {
    Sort.isSorted(Array(7, 5, 1, 3), (x: Int, y: Int) => x < y) should be(false)
  }

  test("isSorted(Array(\"Scala\", \"Exercises\"), (x: String, y: String) => x.length > y.length) should be true") {
    Sort.isSorted(Array("Scala", "Exercises"), (x: String, y: String) => x.length > y.length) should be(true)
  }

}
