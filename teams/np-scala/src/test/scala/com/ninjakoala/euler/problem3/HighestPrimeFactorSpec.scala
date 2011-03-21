package com.ninjakoala.euler.problem3

import org.junit.runner.RunWith
import org.scalatest.WordSpec
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class HighestPrimeFactorSpec extends WordSpec with ShouldMatchers {
	
	"HighestPrimeFactor" should {
		
		"return 29 when asking for the highest prime factor of 13195" in {
			new HighestPrimeFactor().calculate(13195) should equal(29)
		}
		
		"return 6857 when asking for the highest prime factor of 600851475143" in {
			new HighestPrimeFactor().calculate(600851475143L) should equal(6857)
		}
		
	}
	
}