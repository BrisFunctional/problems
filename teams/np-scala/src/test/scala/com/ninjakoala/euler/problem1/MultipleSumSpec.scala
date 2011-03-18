package com.ninjakoala.euler.problem1

import org.junit.runner.RunWith
import org.scalatest.WordSpec
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class MultipleSumSpec extends WordSpec with ShouldMatchers {
	
	"MultipleSum" should {
		"calculate a sum of 23 for numbers below 10" in {
			new MultipleSum().calculateSumBelow(10) should be === (23)
		}
		
		"calculate a sum of 233168 for numbers below 1000" in {
			new MultipleSum().calculateSumBelow(1000) should be === (233168)
		}
	}
	
}