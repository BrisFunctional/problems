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
  (highest-palindrome-less-than 100) => 99)

(fact
  (highest-palindrome-less-than 1000000) => 999999)

(fact
  (highest-palindrome-less-than 999999) => 998899)

(fact
  (is-product-of-two-3-digit-numbers 12321) => true)

(fact
  (is-product-of-two-3-digit-numbers 12251) => false)



; finally!

(fact
  (take 1
    (filter 
      is-product-of-two-3-digit-numbers 
      (highest-palindrome-less-than 1000000))) => 906609)