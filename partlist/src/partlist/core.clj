(ns partlist.core
  (:require [clojure.string :as str]))

(defn partlist
  ([x] (partlist [] [] x))
  ([result firstpart secondpart]
   (let [newfirstpart (conj firstpart (first secondpart))
         newsecondpart (rest secondpart)]
        (if (empty? newsecondpart)
            result
            (recur (conj result (list (str/join " " newfirstpart)
                                      (str/join " " newsecondpart)))
                   newfirstpart
                   newsecondpart)))))

(def thelist ["I", "wish", "I", "hadn't", "come"])
(apply str thelist)
(clojure.string/join " " thelist)
(list (clojure.string/join " " thelist) (clojure.string/join " " thelist))
(conj [] (list "a b" "c d"))
(partlist ["a" "b"])
(partlist ["a" "b" "c"])
(partlist ["a" "b" "c" "d"])
