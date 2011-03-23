primeFactor = {value, factor=2 -> 
    while (factor != value){
    while(value % factor == 0){
            value = (BigInteger)(value/factor)
        }
           factor++
    }
    factor
}

assert primeFactor(13195) == 29
assert primeFactor((BigInteger)600851475143) == 6857