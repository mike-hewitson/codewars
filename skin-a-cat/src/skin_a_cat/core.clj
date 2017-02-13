(ns skin-a-cat.core)

(defn sum
  ([a]
   (partial + a))
  ([a b]
   (+ a b)))
