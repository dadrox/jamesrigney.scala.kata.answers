object Main {
	def main(args: Array[String]) {
		FizzBuzz.fizzbuzz

		val s = "abc"
		println(s + " -> " + Katas.reverse(s))

		println(Katas.countdown(10))

		(1 to 10).foreach(i => println(Katas.fibonacci(i)))

		println("12, 15 -> " + Katas.gcd(12, 15))
		println("12, 24 -> " + Katas.gcd(12, 24))
		println("7 ,13  -> " + Katas.gcd(7, 13))
	}
}

