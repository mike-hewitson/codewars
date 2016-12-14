(ns countdig.core)

(defn nb-dig
  [n d]
  (count
   (filter #(= (str d) (str %))
           (apply str (map #(* % %)
                           (range 0 (inc n)))))))
