(ns brisfunctional.problem2)

(def fibonacci
  ((fn rfib [a b] 
     (lazy-seq 
       (cons 
         a (rfib b (+ a b)))))
    1 2))

(def even-fibonacci
  (filter even? fibonacci))