(ns vowel-indices.core
  (:require [proto-repl.saved-values :refer :all]))

(defn create-map
  [word]
  (zipmap
          (range 1 (inc (count word)))
          word))

(def vowels ["a" "e" "o" "u" "y"])


(create-map "word")
(get (create-map "word") "w")
(map key (create-map "word"))
(key (first (create-map "word")))

(filter (fn [[k v]]
          (proto-repl.saved-values/save 1)
          (= v "r")) 
        (create-map "word"))

(map (fn [[k v]] k) (create-map "word"))
