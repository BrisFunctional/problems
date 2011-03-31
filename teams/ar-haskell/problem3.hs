import Data.List

-- euler problem #3
e3 = find prime $ iterate (head.factors) 600851475143
   where factors n = [ div n x | x <- [2..div n 2], mod n x == 0 ]
         prime = null.factors

