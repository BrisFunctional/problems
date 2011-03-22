def total = 0

sumEvenFiboUpTo = {limit, x=1, y=1 ->
    if (y<limit) call(limit, y, x+y)
    y%2==0 ? total+=y : 0
}
sumEvenFiboUpTo(4000000)

assert total == 4613732