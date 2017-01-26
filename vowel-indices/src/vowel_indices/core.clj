(ns vowel-indices.core
  (:require [proto-repl.saved-values :refer :all]))

(defn create-map
  [word]
  (zipmap
          (range 1 (inc (count word)))
          (clojure.string/lower-case word)))

(defn vowel-indices
  [word]
  (proto-repl.saved-values/save 1)
  (sort (keys (filter (fn [[k v]] (some #(= v %) (seq "aeiouy")))
                     (create-map word)))))

(vowel-indices "Apple")
