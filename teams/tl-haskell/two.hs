module BrisFunctional.Euler2
       ( euler2        
       , prop_euler2
       ) where

import Test.QuickCheck

prop_euler2 :: Property
prop_euler2 = property $ euler2 == 4613732

euler2 :: Integer
euler2 = sum [x | x <- takeWhile (<= 4000000) fibs, even x]

fibs :: [Integer]
fibs = 1 : 2 : zipWith (+) fibs (tail fibs)
