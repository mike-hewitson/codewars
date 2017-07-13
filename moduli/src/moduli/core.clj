(ns moduli.core)

(defn test-correctness
  [n arr]
  (cond
    (< n (reduce * arr)) true))


(defn fromNb2Str
  [n arr]
  (if (test-correctness n arr)
    "Not applicable"
    "-")
  )


