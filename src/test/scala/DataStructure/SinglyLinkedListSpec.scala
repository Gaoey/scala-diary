package DataStructure

import org.scalatest.{FunSuite, Matchers}

class SinglyLinkedListSpec extends FunSuite with Matchers {

  // sum()
  test("List(2,3) when use sum() should be 5"){
    val t = List(2,3)
    List.sum(t) should be(5)
  }

  test("List() when use sum() should be 0"){
    val t = List()
    List.sum(t) should be(0)
  }

  // product()
  test("List(2.0,3.0) when use product() should be 6.0"){
    val t = List(2.0,3.0)
    List.product(t) should be(6.0)
  }

  test("List(0.0) when use product() should be 0.0"){
    val t = List(0.0)
    List.product(t) should be(0.0)
  }

  // tail()
  test("tail(List(1, 2, 3)) shouldBe List(2,3)"){
    List.tail(List(1, 2, 3)) should be(List(2,3))
  }

  test("tail(List(1)) shouldBe List()"){
    List.tail(List(1)) should be(List())
  }

  // setHead()
  test("setHead(List(1, 2, 3), 3) shouldBe List(3,2,3)"){
    List.setHead(List(1, 2, 3), 3) shouldBe List(3,2,3)
  }

  test("setHead(List(\"a\", \"b\"), \"c\") shouldBe List(\"c\",\"b\")"){
    List.setHead(List("a", "b"), "c") shouldBe List("c","b")
  }

  // drop()
  test("drop(List(1, 2, 3), 1) shouldBe List(2,3)"){
    List.drop(List(1, 2, 3), 1) shouldBe List(2,3)
  }

  test("drop(List(1, 2, 3), 0) shouldBe List(1, 2, 3)"){
    List.drop(List(1, 2, 3), 0) shouldBe List(1, 2, 3)
  }
  test("drop(List(\"a\", \"b\"), 2) shouldBe List()"){
    List.drop(List("a", "b"), 2) shouldBe List()
  }

  test("drop(List(1, 2), 3) shouldBe List()"){
    List.drop(List(1, 2), 3) shouldBe List()
  }

  test("drop(Nil, 1) shouldBe Nil"){
    List.drop(Nil, 1) shouldBe Nil
  }

  // dropWhile()
  test("dropWhile(List(1, 2, 3), (x: Int) => x < 2) shouldBe List(2,3)"){
    List.dropWhile(List(1, 2, 3), (x: Int) => x < 2) shouldBe List(2,3)
  }

  test("dropWhile(List(1, 2, 3), (x: Int) => x > 2) shouldBe List(1, 2, 3)"){
    List.dropWhile(List(1, 2, 3), (x: Int) => x > 2) shouldBe List(1, 2, 3)
  }

  test("dropWhile(List(1, 2, 3), (x: Int) => x > 0) shouldBe List()"){
    List.dropWhile(List(1, 2, 3), (x: Int) => x > 0) shouldBe List()
  }

  test("dropWhile(Nil, (x: Int) => x > 0) shouldBe Nil"){
    List.dropWhile(Nil, (x: Int) => x > 0) shouldBe Nil
  }

  // init()
  test("init(List(1, 2, 3)) shouldBe Cons(1, Cons(2, Nil))"){
    List.init(List(1, 2, 3)) shouldBe Cons(1, Cons(2, Nil))
  }

  test("init(List(1)) shouldBe \nNil"){
    List.init(List(1)) shouldBe Nil
  }

  // foldRight()
  test("foldRight(List(1, 2, 3), Nil: List[Int])(Cons(_, _)) shouldBe Cons(1, Cons(2, Cons(3, Nil)))"){
    List.foldRight(List(1, 2, 3), Nil: List[Int])(Cons(_, _)) shouldBe Cons(1, Cons(2, Cons(3, Nil)))
  }

  // length()
  test("length(l) shouldBe 5"){
    def l = List(1, 2, 3, 4, 5)
    List.length(l) shouldBe 5
  }

  // sum2()
  test("sum2(List(2,3)) should be(5)"){
    val t = List(2,3)
    List.sum2(t) should be(5)
  }

  test("sum2(List()) should be(0)"){
    val t = List()
    List.sum2(t) should be(0)
  }

  // product2()
  test("List(2.0,3.0) when use product2() should be 6.0"){
    val t = List(2.0,3.0)
    List.product2(t) should be(6.0)
  }

  test("List(0.0) when use product2() should be 0.0"){
    val t = List(0.0)
    List.product2(t) should be(0.0)
  }

  // sum3()
  test("sum3(List(2,3)) should be(5)"){
    val t = List(2,3)
    List.sum3(t) should be(5)
  }

  test("sum3(List()) should be(0)"){
    val t = List()
    List.sum3(t) should be(0)
  }

  // product3()
  test("List(2.0,3.0) when use product3() should be 6.0"){
    val t = List(2.0,3.0)
    List.product3(t) should be(6.0)
  }

  test("List(0.0) when use product3() should be 0.0"){
    val t = List(0.0)
    List.product3(t) should be(0.0)
  }

  // length2()
  test("length2() of List(1,2,3,4,5) should be 5"){
    val t = List(1,2,3,4,5)
    List.length2(t) should be(5)
  }

  // flatMap()
  test("flatMap(List(1, 2, 3))(i => List(i, i)) shouldBe List(1,1,2,2,3,3)"){
    List.flatMap(List(1, 2, 3))(i => List(i, i)) shouldBe List(1,1,2,2,3,3)
  }

  // zipWith()
  test("zipWith(List(\"a\", \"b\", \"c\"), List(\"A\", \"B\", \"C\"))(_ + _) shouldBe List(\"aA\", \"bB\", \"cC\")"){
    List.zipWith(List("a", "b", "c"), List("A", "B", "C"))(_ + _) shouldBe List("aA", "bB", "cC")
  }

  test("zipWith(List(1, 2, 3), List(4, 5, 6))(_.toString + _.toString()) shouldBe List(\"14\", \"25\", \"36\")"){
    List.zipWith(List(1, 2, 3), List(4, 5, 6))(_.toString + _.toString()) shouldBe List("14", "25", "36")
  }

  // hasSubsequence
  test("hasSubsequence(l, List(2, 3)) shouldBe true"){
    def l = List(1, 2, 3, 4, 5)
    List.hasSubsequence(l, List(2, 3)) shouldBe true
  }

  test("hasSubsequence(l, List(0, 1)) shouldBe false"){
    def l = List(1, 2, 3, 4, 5)
    List.hasSubsequence(l, List(0, 1)) shouldBe false
  }

  test("hasSubsequence(l, Nil) shouldBe true"){
    def l = List(1, 2, 3, 4, 5)
    List.hasSubsequence(l, Nil) shouldBe true
  }

}
