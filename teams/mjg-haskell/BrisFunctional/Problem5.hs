module BrisFunctional.Problem5
( problem5
, testProblem5 )
where

import Test.HUnit

-- Problem 5
-- What is the smallest positive number that is evenly divisible
-- by all of the numbers from 1 to 20?
-- nb 6840 = 20*19*18
problem5 :: Integer -> Integer
problem5 a
  | divides1_20 a = a
  | otherwise     = problem5 (a+6840)
  where divides1_20 = (\s -> (all (==True) (map (\t -> s `mod` t == 0) [1..20])))


-- test case
testProblem5 = TestCase $ assertEqual 
  "Problem 5 answer = 232792560"
  232792560
  ( problem5 6840 ) 

