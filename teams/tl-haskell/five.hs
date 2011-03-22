module BrisFunctional.Euler5
       ( euler5        
       , prop_euler5
       ) where

import Test.QuickCheck 

prop_euler5 :: Property
prop_euler5 = property $ euler5 == 232792560

euler5 :: Integer
euler5 =  head [x | x <- [step, (2 * step) ..]
                  , (foldr1 (+) (map (mod x) [2..20])) == 0
                  ]
          where step = foldl1 (*) [20,19,18]
