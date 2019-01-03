package DataStructure

import org.scalatest.{FunSuite, Matchers}

class TreeSpec  extends FunSuite with Matchers {
  test("size( Branch(Branch(Leaf(1), Leaf(2)), Leaf(3))) shouldBe 5"){
    def t = Branch(Branch(Leaf(1), Leaf(2)), Leaf(3))
    Tree.size(t) shouldBe 5
  }

  test("depth( Branch(Branch(Leaf(1), Leaf(2)), Leaf(3))) shouldBe 2"){
    def t = Branch(Branch(Leaf(1), Leaf(2)), Leaf(3))
    Tree.depth(t) shouldBe 2
  }

  test("Tree.map(t)(_ * 2) shouldBe Branch(Branch(Leaf(2), Leaf(4)), Leaf(6))"){
    def t = Branch(Branch(Leaf(1), Leaf(2)), Leaf(3))
    Tree.map(t)(_ * 2) shouldBe Branch(Branch(Leaf(2), Leaf(4)), Leaf(6))
  }

  test("reimplement size, maximum, depth, and map in terms of this more general function") {
    def t = Branch(Branch(Leaf(1), Leaf(2)), Leaf(3))

    Tree.sizeViaFold(t) shouldBe 5
    Tree.maximumViaFold(t) shouldBe 3
    Tree.depthViaFold(t) shouldBe 2
    Tree.mapViaFold(t)(_ % 2 == 0) shouldBe Branch(Branch(Leaf(false), Leaf(true)), Leaf(false))
  }
}
