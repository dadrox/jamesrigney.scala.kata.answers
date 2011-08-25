import scala.collection.mutable.StringBuilder

object FizzBuzz {
	def fizzbuzz(n: Int): String = n match {
		case n if(n % 15 == 0) => "FizzBuzz"
		case n if(n % 3 == 0) => "Fizz"
		case n if(n % 5 == 0) => "Buzz"
		case _ => n.toString
	}

	def fizzbuzz(range: Range): String = {
		val s = new StringBuilder
		range.foreach { i => s.append(fizzbuzz(i)).append("\n") }
		s.toString
	}

	def fizzbuzz() {
		println(FizzBuzz.fizzbuzz(1 to 100))
	}
}
