(ns haskell-array-operations.core)


(defn head [sequence]
  (first sequence))


(defn tail [sequence]
  (rest sequence))


(defn init [sequence]
  (drop-last sequence))


(defn last_ [sequence]
  (first (reverse sequence)))
