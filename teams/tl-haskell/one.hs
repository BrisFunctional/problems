module BrisFunctional.Euler1
       ( euler1 
       , prop_euler1
       ) where

import Test.QuickCheck

euler1 :: Integer
euler1 = sum [x | x <- [1..999], x `mod` 3 == 0 || x `mod` 5 == 0]

prop_euler1 :: Property
prop_euler1 = property $ euler1 == 233168
