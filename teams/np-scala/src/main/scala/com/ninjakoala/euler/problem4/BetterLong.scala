package com.ninjakoala.euler.problem4

object MakeBetterLong {
	implicit def makeBetterLongFromLong(l: Long): BetterLong = new BetterLong(l)
}

class BetterLong(val l: Long) {
	
	def isPalindrome: Boolean = {
		l == reverse
	}
	
	def reverse: Long = {
		doReverse(l, 0)
	}
	
	private def doReverse(n: Long, acc: Long): Long = {
		
		if (n == 0) return acc
		
		val lowestDigit = n % 10
		
		doReverse(n / 10, (acc * 10) + lowestDigit)
		
	}
	
	def isProductOfTwoThreeDigitNumbers: Boolean = {
		
		999 until 100 by -1 foreach { left => 
			999 until 100 by -1 foreach { right =>
				if (left * right == l) return true
			}
		}
		
		return false
		
	}
	
}