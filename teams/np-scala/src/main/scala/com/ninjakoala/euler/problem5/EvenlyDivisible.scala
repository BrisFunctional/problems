package com.ninjakoala.euler.problem5

class EvenlyDivisible {
	
	def calculate(max: Long): Long = {
		
		max until 1000000000 by max foreach { n =>
			max until 2 by -1 map { n % _ == 0 } find { _ == false } match {
				case None => return n
				case Some(_) => 
			}
		}
		
		return -1
		
	}
	
}