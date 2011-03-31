
-- euler problem #1
e1 = sum [ x | x <- [1..999], or $ map ((== 0).mod x) [3,5]]

