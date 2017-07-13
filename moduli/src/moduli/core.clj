(ns moduli.core)

(defn test-valid
  [n arr]
  (cond
    (< n (reduce * arr)) true
    :else                false)
  )


(defn fromNb2Str
  [n arr]
  (if (test-valid  n arr)
    (str "-"
         (apply str (interpose "--" (map str (map #(rem n %) arr))))
         "-")
    "Not applicable" ))

(comment
  (test-valid 187 [8 7 5 3]))
