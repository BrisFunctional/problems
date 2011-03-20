module BrisFunctional.Problem3
( problem3
, testProblem3 )
where

import Test.HUnit

-- Problem 3
-- What is the largest prime factor of the number 600851475143 ?
problem3 :: (Integral a) => a -> a
problem3 a = recurse a 2

recurse :: (Integral a) => a -> a -> a
recurse num divisor
  | num == divisor         = num
  | num `mod` divisor == 0 = recurse (num `div` divisor) divisor
  | otherwise              = recurse num (divisor+1)


-- test case
testProblem3 = TestCase $ assertEqual 
  "Problem 3 answer = 6857"
  6857
  ( problem3 600851475143 ) 

