
sumEvenFiboUpTo = {limit, x=1, y=1, total=0 ->
    if (y<limit) call(limit, y, x+y, (y%2==0 ? total+y : total))
    else total
}

assert sumEvenFiboUpTo(4000000) == 4613732
