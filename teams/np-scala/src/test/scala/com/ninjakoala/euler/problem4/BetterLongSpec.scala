package com.ninjakoala.euler.problem4

import org.junit.runner.RunWith
import org.scalatest.WordSpec
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers
import MakeBetterLong._

@RunWith(classOf[JUnitRunner])
class BetterLongSpec extends WordSpec with ShouldMatchers {
	
	"BetterLong" should {
		
		"return 4321 when asking for the reverse of 1234" in {
			1234L.reverse should equal(4321)
		}
		
		"return 8457854 when asking for the reverse of 4587548" in {
			4587548L.reverse should equal(8457854)
		}
		
		"say that 1221 is a palindrome" in {
			1221L.isPalindrome should equal(true)
		}
		
		"say that 1234 is not a palindrome" in {
			1234L.isPalindrome should equal(false)
		}
		
		"say that 998001 is a product of two three digit numbers" in {
			998001L.isProductOfTwoThreeDigitNumbers should equal(true)
		}
		
		"say that 9900 is not a product of two three digit numbers" in {
			9900L.isProductOfTwoThreeDigitNumbers should equal(false)
		}
		
		"say that 906609 is both a palindrome and a product of two three digit numbers" in {
			
			999 * 999 until 100 * 100 by -1 find { i => i.isPalindrome && i.isProductOfTwoThreeDigitNumbers } should equal(Some(906609))
			
		}
		
	}
	
}