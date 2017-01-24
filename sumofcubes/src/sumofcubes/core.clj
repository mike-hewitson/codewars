(ns sumofcubes.core
  (:require [proto-repl.saved-values :refer :all]))

; this solution takes too long, need a mathematical one
; (defn find-nb
;   ([m]
;    (find-nb m 1))
;   ([m i]
;    (cond
;      (= m 0) (- i 1)
;      (< m 0) -1
;      :else (recur (- m (*' i i i))
;                   (inc i)))))

(defn binomial
  ([n k] (binomial n k 0))
  (/ (factorial (inc n))
     (* 2 (factorial (dec n)))))

(binomial 5)

(defn find-nb
  [n]
  (let [root (Math/sqrt n)]
    (if (= (Math/floor root) root)
        (binomial root)
        (dec 0))))

(Math/sqrt 102525193459636447345267623154781254785178)
(find-nb 100)
