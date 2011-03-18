(ns brisfunctional.problem3)

(defn find-largest-prime-factor [n]
  
  (loop [number n
         divisor 2]
    
    (if (= number divisor)
      number
      
      (if (= 0 (mod number divisor))
        
        (recur (/ number divisor) divisor)
        (recur number (+ 1 divisor))))))