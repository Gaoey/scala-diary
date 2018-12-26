package DataStructure

// "Step 1: How to define a simple class to represent a Donut object"
class Donut(name: String, productCode: Long){
  def print = s"Donut name = $name, productCode = $productCode"
}

// "Step 2: How to declare a companion object for the Donut class"
// A Companion Object is defined using the object keyword and the name of the object should be identical to the class name.
object Donut {

  // the companion object should define an `apply()` method which will be responsible for instantiating an instance of the given class.
  def apply(name: String, productCode: Long): Donut = {
    new Donut(name, productCode)
  }

}