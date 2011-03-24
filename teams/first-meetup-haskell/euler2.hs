fib 1 = 1
fib 2 = 2
fib n = fib (n-1) + fib (n-2)

e1 = sum [ x | x <- [1..999], (mod x 3 == 0) || (mod x 5 == 0)]

e2 = sum [ x | x <- takeWhile (<4000000) fibList, even x]
       where fibList = 1:2:zipWith (+) fibList (tail fibList)

