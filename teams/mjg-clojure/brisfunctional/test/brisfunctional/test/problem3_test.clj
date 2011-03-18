(ns brisfunctional.test.problem3-test
  (:use [brisfunctional.problem3] :reload)
  (:use [clojure.test])
  (:use midje.sweet))

(fact
  (find-largest-prime-factor 8) => 2)

(fact
  (find-largest-prime-factor 14) => 7)

(fact
  (find-largest-prime-factor 13195) => 29)

(fact
  (find-largest-prime-factor 600851475143) => 6857)