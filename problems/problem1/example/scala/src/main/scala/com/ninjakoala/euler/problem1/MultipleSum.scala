package com.ninjakoala.euler.problem1

class MultipleSum {
	
	def calculateSumBelow(value: Int): Int = {
		val values = for (i <- List.range(1, value) if i % 3 == 0 || i % 5 == 0) yield i
		values.sum
	}
	
}
