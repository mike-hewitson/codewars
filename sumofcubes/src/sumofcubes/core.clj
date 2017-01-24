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

; (find-nb 102525193459636447345267623154781254785178)
(Math/sqrt 102525193459636447345267623154781254785178)
(defn sqr [n] (* n n))

(defn sum-of-cubes
  [n]
  (/ (* (sqr n)
        (sqr (+ n 1)))
     4))

(defn find-nb
  [n]
  (let [root (Math/sqrt n)]
    (proto-repl.saved-values/save 1)
    (if (= (Math/floor root) root)
        (dec root)
        -1)))


(find-nb 9)
(sum-of-cubes 2)
(Math/cbrt 225)
(Math/sqrt 225)

(defn n-given-tri
  [tri]
  (/ (- (Math/sqrt (+ 1
                      (* 8 tri)))
        1)
     2))

(n-given-tri 6)

(defn n-th-tri
  [n])
