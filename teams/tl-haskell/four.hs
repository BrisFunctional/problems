module BrisFunctional.Euler4
       ( euler4        
       , prop_euler4
       ) where

import Test.QuickCheck 
import Data.Digits

prop_euler4 :: Property
prop_euler4 = property $ euler4 == 906609

euler4 :: Integer
euler4 =  foldl1 (max) three_digit_palendromes
  
three_digit_palendromes :: [(Integer)]
three_digit_palendromes = [(x * y) | x <- three_digits
                                   , y <- three_digits
                                   , digits 10 (x * y) == digitsRev 10 (x * y)
                                   ]
  where three_digits = [999,998..100]
