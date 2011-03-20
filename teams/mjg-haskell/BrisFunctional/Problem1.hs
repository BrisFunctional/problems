module BrisFunctional.Problem1
( problem1
, testProblem1 )
where

import Test.HUnit

-- Problem 1
-- Find the sum of all the multiples of 3 or 5 below 1000.
problem1 :: (Integral a) => a
problem1 = sum [ x | x <- [1..999], or [(x `mod` 3 == 0), (x `mod` 5 == 0)] ]

-- test case
testProblem1 = TestCase $ assertEqual 
  "Problem 1 answer = 233168"
  233168 
  ( problem1 ) 

