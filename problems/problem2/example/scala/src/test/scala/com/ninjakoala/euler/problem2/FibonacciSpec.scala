package com.ninjakoala.euler.problem2

import org.junit.runner.RunWith
import org.scalatest.WordSpec
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class FibonacciSpec extends WordSpec with ShouldMatchers {
	
	"Fibonacci" should {
		"generate a sequence of 1 when asking for 1 value" in {
			new Fibonacci().sequence(1) should equal(List(1))
		}
		
		"generate a sequence of 1, 2 when asking for 2 values" in {
			new Fibonacci().sequence(2) should equal(List(1, 2))
		}
		
		"generate a sequence of 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 when asking for 10 values" in {
			new Fibonacci().sequence(10) should equal(List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89))
		}
		
		"generate a sequence of 1, 2, 3, 5 when asking for values not exceeding 5" in {
			new Fibonacci().sequenceNotExceeding(5) should equal(List(1, 2, 3, 5))
		}
		
		"generate a sequence of 4613732 when asking for the sum of even values not exceeding 4000000" in {
			new Fibonacci().sequenceNotExceeding(4000000).filter(_ % 2 == 0).sum should equal(4613732)
		}
		
	}
	
}