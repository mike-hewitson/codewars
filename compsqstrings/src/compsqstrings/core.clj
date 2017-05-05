(ns compsqstrings.core
  (:require [clojure.string :as s]))

(defn compose[s1 s2]
  (let [a (s/split s1 #"\n")
        b (reverse (s/split s2 #"\n"))
        length (inc (count (first a)))]
    (->>
     (map vector a b (range))
     (map (fn [[a b c]] (subs (str (subs a 0 (inc c)) b) 0 length)))
     (s/join "\n"))))
