(ns vowel-indices.core
  (:require [proto-repl.saved-values :refer :all]))

(defn create-map
  [word]
  (zipmap
          (range 1 (inc (count word)))
          (clojure.string/lower-case word)))

(defn vowel-indices
  [word]
  (sort (keys (filter (fn [[k v]] (some #(= v %) (seq "aeiouy")))
                     (create-map word)))))

(vowel-indices "Apple")

(def vowels #{\a \A \e \E \i \I \o \O \u \U \y \Y})

(defn vowel-indices-best
  [word]
  (keep-indexed #(when (vowels %2) (inc %1)) word))
