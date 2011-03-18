(ns brisfunctional.problem1)

(defn sum-of-multiples-of-3-or-5-below [n]
  
  (reduce +
    (filter 
      #(or
         (= 0 (mod % 3))
         (= 0 (mod % 5))) 
      (range 1 n))))