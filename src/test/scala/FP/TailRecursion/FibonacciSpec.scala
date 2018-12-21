package FP.TailRecursion

import org.scalatest.{FunSuite, Matchers}

class FibonacciSpec extends FunSuite with Matchers {

  test("fibo(5) should be 5") {
    Fibonacci.fib(5) should be(5)
  }

  test("fibo(0) should be 0") {
    Fibonacci.fib(0) should be(0)
  }

}
