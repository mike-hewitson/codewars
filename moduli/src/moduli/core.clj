(ns moduli.core)


(defn gcd
  "Calculate the greatest commond divisor of two integers using Eclid's algorithm"
  [m n]
  (if (< m n)
    (recur n m)
    (if (zero? n)
      m
      (recur n (mod m n)))))


(def coprime?
  "Determine if two numbers are coprime"
  (comp (partial = 1) gcd))


(defn valid?
  [n arr]
  (cond
    (< n (reduce * arr)) true
    :else                false)
  )


(defn coprimes [arr]
  (if (< (count arr) 2)
    '()
    (into (map #(coprime? (first arr) %) (rest arr))
          (coprimes (rest arr)))))


(defn valid?
  [n arr]
  (and
   (< n (reduce * arr))
   (every? identity (coprimes arr))))


(defn fromNb2Str
  [n arr]
  (if (valid?  n arr)
    (str "-"
         (apply str (interpose "--" (map str (map #(rem n %) arr))))
         "-")
    "Not applicable" ))


(comment
  (test-valid 187 [8 7 5 3])
  (every? identity (map #(coprime? 2 %) [3 4]))
  (coprimes [2 3 4])
  (def arr [8 7 5 3])
  (first arr)
  (rest arr)
  (valid? 6 [2 3 4]))
