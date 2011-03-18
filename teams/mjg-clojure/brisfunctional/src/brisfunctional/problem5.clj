(ns brisfunctional.problem5)

(defn gcd
  "Greatest common divisor, via Euclid's algorithm"
  [a b]
  
  ; we must have a > b
  (if (> b a)
    (gcd b a)
    
    (loop [a a
           b b]
      
      (if (= 0 b)
        a
        (recur b (mod a b)))))) 

(defn lcm
  "lowest common multiple, according to identity that lcm(a,b) = ab/gcd(a,b)"
  [a b]
  (/ 
    (* a b)
    (gcd a b)))
