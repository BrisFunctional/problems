(ns brisfunctional.test.problem5-test
  (:use [brisfunctional.problem5] :reload)
  (:use [clojure.test])
  (:use midje.sweet))


(fact 
  (gcd 21 49) => 7)

(fact 
  (gcd 100 140) => 20)


(fact
  (lcm 5 9) => 45)

(fact
  (lcm 3 21) => 21)


(fact
  (reduce lcm (range 1 10)) => 2520)

(fact
  (reduce lcm (range 1 20)) => 232792560)