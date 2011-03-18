(ns brisfunctional.test.problem1-test
  (:use [brisfunctional.problem1] :reload)
  (:use [clojure.test])
   (:use midje.sweet))


(fact
  (sum-of-multiples-of-3-or-5-below 10) => 23)

(fact
  (sum-of-multiples-of-3-or-5-below 1000) => 233168)
