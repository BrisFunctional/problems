
-- euler problem #6
e6 = (sqr $ sum [1..100]) - (sum $ map sqr [1..100])
   where sqr = (^2)

