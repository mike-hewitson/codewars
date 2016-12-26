(ns rotations.core)

(defn build-rotations
  ([strng]
   (build-rotations strng [] (.length strng)))
  ([strng rotations rotations-to-go]
   (let [rotated (str (subs strng 1) (subs strng 0 1))]
     (if (= rotations-to-go 0)
       rotations
       (recur rotated (conj rotations rotated) (dec rotations-to-go))))))

(defn result-compare [rotations arr]
  (cond
    (empty? rotations) true
    (some #(= (first rotations) %) arr) (result-compare (rest rotations) arr)
    :else false))

(defn contain-all-rots [strng arr]
  (every? (set arr) (build-rotations strng)))
