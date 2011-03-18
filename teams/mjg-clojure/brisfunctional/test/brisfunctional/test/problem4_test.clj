(ns brisfunctional.test.problem4-test
  (:use [brisfunctional.problem4] :reload)
  (:use [clojure.test])
  (:use midje.sweet))

(fact
  (number-reverser 301) => 103)


(fact
  (is-palindrome 301) => false)

(fact
  (is-palindrome 123454321) => true)


(fact
  (is-product-of-two-3-digit-numbers 12321) => true)

(fact
  (is-product-of-two-3-digit-numbers 12251) => false)



(fact
  (first
    (filter 
      #(and 
        (is-palindrome %)
        (is-product-of-two-3-digit-numbers %))
      (range (* 999 999) 0 -1)))
  
  => 906609)