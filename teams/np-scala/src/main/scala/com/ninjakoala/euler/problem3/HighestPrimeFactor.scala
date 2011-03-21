package com.ninjakoala.euler.problem3

class HighestPrimeFactor {
	
	def calculate(n: Long): Long = {
		calculateRecursive(n, 2)
	}
	
	private def calculateRecursive(n: Long, div: Long): Long = {
		
		if (n == div) n
		else if (n % div != 0) calculateRecursive(n, div + 1)
		else calculateRecursive(n / div, div)
		
	}
	
}