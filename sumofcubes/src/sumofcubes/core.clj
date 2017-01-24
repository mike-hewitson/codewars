(ns sumofcubes.core)

(defn find-nb
  ([m]
   (find-nb m 1))
  ([m i]
   (cond
     (= m 0) (- i 1)
     (< m 0) -1
     :else (recur (- m (*' i i i))
                  (inc i)))))

(find-nb 102525193459636447345267623154781254785178)
