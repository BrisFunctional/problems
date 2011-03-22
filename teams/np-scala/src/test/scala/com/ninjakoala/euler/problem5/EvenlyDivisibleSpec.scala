package com.ninjakoala.euler.problem5

import org.junit.runner.RunWith
import org.scalatest.WordSpec
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class EvenlyDivisibleSpec extends WordSpec with ShouldMatchers {
	
	"EvenlyDivisible" should {
		
		"return 2520 as the smallest number evenly divisible by 1 to 10" in {
			new EvenlyDivisible().calculate(10) should equal(2520)
		}
		
		"return 232792560 as the smallest number evenly divisible by 1 to 20" in {
			new EvenlyDivisible().calculate(20) should equal(232792560)
		}
		
	}
	
}