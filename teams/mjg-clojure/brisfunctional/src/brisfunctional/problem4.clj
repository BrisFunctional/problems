(ns brisfunctional.problem4)

(defn number-reverser [n]

  (loop [countdown n
         countup 0]

    (if (= 0 countdown)
      countup
      (recur 
        (Math/floor (/ countdown 10)) 
        (+ (* 10 countup) (mod countdown 10))))))

(defn is-palindrome [n]
  (= n (number-reverser n)))

(defn highest-palindrome-less-than [n]
  
  (def starting-val (- n 1))
  
  (loop [number starting-val]
    
    (if (is-palindrome number)
      number
      (recur (- number 1)))))

(defn is-product-of-two-3-digit-numbers
  "Trial division from 100-999, check if 100 <= remainder <= 999" 
  [n]
  
  (loop [div1 100]
    (if (and 
          (= 0 (mod n div1))
          (<= 100 (/ n div1))
          (>= 999 (/ n div1)))
      true
      
      (if (= 999 div1)
        false
        
        (recur (+ 1 div1))))))
