
-- euler problem #4
e4 = maximum $ filter palindrome [ x*y | x <- [999,998..100], y <- [999,998..x] ]
   where palindrome x = (show x) == reverse (show x) 

