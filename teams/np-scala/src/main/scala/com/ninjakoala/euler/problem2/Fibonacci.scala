package com.ninjakoala.euler.problem2

class Fibonacci {
	
	def sequence(n: Int): List[Int] = {
		List.range(0, n).map(fibonacci(_))
	}
	
	def sequenceNotExceeding(n: Int): List[Int] = {
		List.range(0, 100000).takeWhile(fibonacci(_) <= n).map(fibonacci(_))
	}
	
	private def fibonacci(n: Int): Int = {
		if (n == 0) return 1
		if (n == 1) return 2
		
		fibonacci(n - 1) + fibonacci(n - 2)
	}
	
}