package FP.TailRecursion

import org.scalatest.{FunSuite, Matchers}

class FactorialSpec extends FunSuite with Matchers {

  test("fac(5) should be 120") {
    Factorial.fac(5) should be(120)
  }

  test("fac(0) should be 1") {
    Factorial.fac(0) should be(1)
  }

}
