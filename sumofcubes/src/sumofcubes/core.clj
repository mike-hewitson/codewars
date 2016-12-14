(ns sumofcubes.core)

(defn find-nb [m])
  ; your code)

; check if total reached
;  if remaining = 0 return count
;  if remaining negative return -1
; next level
;  subtract amount from remaining, add one to count, recurse


(defn cubes*
  ([] (cubes* 1))
  ([n] (cons (* n n n)
             (lazy-seq (cubes* (inc n))))))

(def try (cube*))

(take 6 try)
