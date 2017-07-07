(ns minnbdiv.core)


(defn get-factors [n]
  (mapcat (fn [x] [x (/ n x)])
          (filter #(zero? (rem n %)) (range 1 (inc (Math/sqrt n)))) ))


(defn count-factors [n]
  [(count (set (get-factors n)))
   n])


(defn find-min-num [n]
  (some (fn [[factors answer]] (and (= factors n) answer))
        (map count-factors (map #(+ 2 %) (range)))))
