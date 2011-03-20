module BrisFunctional.Problem2
( problem2
, testProblem2 )
where

import Test.HUnit

-- Problem 2
-- By considering the terms in the Fibonacci sequence whose values do
-- not exceed four million, find the sum of the even-valued terms.
problem2 :: Integer
problem2 = sum (filter even $ takeWhile (<4000000) [ memoized_fib x | x <- [0..] ])

-- this works, but it is very slow
fibonacci :: Integer -> Integer
fibonacci 0 = 1
fibonacci 1 = 2
fibonacci x = fibonacci (x-1) + fibonacci (x-2)
  
-- this is (much) faster as it uses memoization to avoid unnecessary calculation
memoized_fib :: Int -> Integer
memoized_fib =
   let fib 0 = 1
       fib 1 = 2
       fib n = memoized_fib (n-2) + memoized_fib (n-1)
   in  (map fib [0 ..] !!)



-- test case
testProblem2 = TestCase $ assertEqual 
  "Problem 2 answer = 4613732"
  4613732
  ( problem2 ) 

