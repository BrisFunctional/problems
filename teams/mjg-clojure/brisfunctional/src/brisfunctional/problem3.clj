(ns brisfunctional.problem3)

(defn find-largest-prime-factor
  "Recursively remove factors of n starting from 2 and counting up.
   We don't need to check explicitly that they are primes,
   as all smaller divisors are factored out first"
  [n]
  
  (loop [number n
         divisor 2]
    
    (if (= number divisor)
      number
      
      (if (= 0 (mod number divisor))
  
        (recur (/ number divisor) divisor)
        (recur number (+ 1 divisor))))))
