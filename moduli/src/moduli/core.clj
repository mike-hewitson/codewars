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

