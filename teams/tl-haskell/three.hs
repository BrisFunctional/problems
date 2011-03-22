module BrisFunctional.Euler3
       ( euler3        
       , prop_euler3
       ) where

import Test.QuickCheck

prop_euler3 :: Property
prop_euler3 = property $ euler3 == 6857

euler3 :: Integer
euler3 = highest_prime_factor 600851475143 2
 
highest_prime_factor :: Integer -> Integer -> Integer
highest_prime_factor num divisor
  | num == divisor = num
  | num `mod` divisor /= 0 = highest_prime_factor num (divisor + 1) 
  | otherwise = highest_prime_factor (num `div` divisor) divisor
