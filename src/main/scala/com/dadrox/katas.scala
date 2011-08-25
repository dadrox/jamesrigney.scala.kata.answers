
object Katas {
	def reverse(word: String) = word.reverse

	def countdown(start: Int): List[Int] = {
		(0 to start).reverse.toList
	}

	def fibonacci(n: Int): Int = n match {
		case 1 | 2 => 1
		case _ => fibonacci(n - 1) + fibonacci(n - 2)
	}

	def gcd(left: Int, right: Int) = {
		def divisors(n: Int): List[Int] = {
			(1 to n).filter(n % _ == 0).toList
		}
		divisors(left).intersect(divisors(right)).max
	}

	def welcome(lastName: String, isWoman: Boolean, isSir: Boolean) = {
		if(isWoman) "Hello Ms. " + lastName
		else if (isSir) "Hello Sir " + lastName
		else "Hello Mr. " + lastName
	}
}
