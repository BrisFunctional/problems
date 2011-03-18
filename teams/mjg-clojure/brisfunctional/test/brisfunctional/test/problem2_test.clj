(ns brisfunctional.test.problem2-test
  (:use [brisfunctional.problem2] :reload)
  (:use [clojure.test])
  (:use midje.sweet))


(fact
  (take 2 fibonacci) => '(1 2))

(fact
  (take 10 fibonacci) => '(1 2 3 5 8 13 21 34 55 89))

(fact
  (take-while #(< % 10) fibonacci) => '(1 2 3 5 8))

(fact
  (take-while #(< % 10) even-fibonacci) => '(2 8))

(fact
  (reduce + 
      (take-while #(< % 4000000) even-fibonacci))
  => 4613732)

