def findMultiplesUnderLimit = {limit ->
    (1..<limit).sum {it%3==0||it%5==0?it:0}
}
assert findMultiplesUnderLimit(10) == 23
assert findMultiplesUnderLimit(1000) == 233168