(ns moduli.core)

<<<<<<< HEAD
(defn test-correctness
  [n arr]
  (cond
    (< n (reduce * arr)) true))
=======
(defn test-valid
  [n arr]
  (cond
    (< n (reduce * arr)) true
    :else                false)
  )
>>>>>>> 6f6781feec94deaa148ebdb37e5aba84aa279643


(defn fromNb2Str
  [n arr]
<<<<<<< HEAD
  (if (test-correctness n arr)
    "Not applicable"
    "-")
  )


=======
  (if (test-valid  n arr)
    (str "-"
         (apply str (interpose "--" (map str (map #(rem n %) arr))))
         "-")
    "Not applicable" ))

(comment
  (test-valid 187 [8 7 5 3]))
>>>>>>> 6f6781feec94deaa148ebdb37e5aba84aa279643
