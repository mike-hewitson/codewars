(ns vowel-indices.core
  (:require [proto-repl.saved-values :refer :all]))

(defn create-map
  [word]
  (zipmap
          (-> word
              count
              inc
              range 1)
          (clojure.string/lower-case word)))

(defn vowel-indices-mine
  [word]
  (-> (filter (fn [[k v]] (some #(= v %) (seq "aeiouy"))
                      (create-map word)))
      keys
      sort))

(vowel-indices-mine "sUpEr")

(def vowels #{\a \e \i \o \u \U \y})

(defn vowel-indices
  [word]
  (keep-indexed #(when (vowels %2) (inc %1)) (clojure.string/lower-case word)))
