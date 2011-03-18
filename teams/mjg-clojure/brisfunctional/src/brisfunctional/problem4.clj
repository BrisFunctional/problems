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

(defn is-product-of-two-3-digit-numbers
  "Trial division from (max n/999 100) to (min n/100 999)" 
  [n]
  
  (let [lower-bound (max (int (/ n 999)) 100)
        upper-bound (min (/ n 100) 999)] 
  
    (loop [div lower-bound]
    
      (if (= 0 (mod n div))
        true
        
        (if (< upper-bound div)
          false
          
          (recur (+ 1 div)))))))
  