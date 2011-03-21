module BrisFunctional.Problem4
( problem4
, testProblem4 )
where

import Test.HUnit

-- Problem 4
-- Find the largest palindrome made from the product of two 3-digit numbers.
problem4 :: Integer
problem4 = head [ x | x <- [999999, 999998 ..], isPalindrome x, isProductOfTwoThreeDigitNumbers x ]

isPalindrome :: Integer -> Bool
isPalindrome a = a == reverseNum a

-- repeatedly divide by ten until we reach 0, putting results in a list
-- take the last digit of each element of that list
-- recombine to put all digits of original number in reverse order
reverseNum :: Integer -> Integer
reverseNum a = foldl1 (\x y -> 10*x + y)  (map (`mod` 10) ((takeWhile (>0) (iterate (`div` 10) a))))


-- build the list of products of three-digit numbers once
productsOfThreeDigitNumbers = [ a*b | a <- [999,998..100], b <- [a,(a-1)..100] ]

isProductOfTwoThreeDigitNumbers :: Integer -> Bool
isProductOfTwoThreeDigitNumbers a = elem a productsOfThreeDigitNumbers



-- test case
testProblem4 = TestCase $ assertEqual 
  "Problem 4 answer = 906609"
  906609
  ( problem4 ) 

