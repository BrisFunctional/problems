(ns euler1)

(defn ismod0 [x y]
   (= (mod x y) 0))


(defn get-it [arg]
  (reduce +
    (filter 
      (fn [x] (or 
                (ismod0 x 3)
                (ismod0 x 5))) 
      (range 1 arg))))


(println (get-it 1000))
