
-- euler problem #5
e5 = head [ x | x <- [s,2*s..], testFactors x]
   where testFactors x = all ((==0).mod x) [11..20] 
         -- factors [1..10] are entailed by factors [11..20]
         s = product [11,13,17,19] 



