
-- euler problem #7
e7 = head $ drop 10000 primes
   where primes = 2 : [x | x <- [3..], prime x]
         prime x = testFactors x $ takeWhile (<= intSqrt x) primes
         testFactors x = all ((/=0).mod x)
         intSqrt = truncate.sqrt.fromIntegral

