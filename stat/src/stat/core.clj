(ns stat.core)

(defn split-time
  [time]
  ((fn [[hh mm ss]]
     (+ (* hh 3600) (* mm 60) ss))
   (map read-string (clojure.string/split time #"\|"))))

(defn join-time
  [seconds]
  (str (quot seconds 3600) "|"
       (- (quot seconds 60) (* (quot seconds 3600) 60)) "|"
       (mod seconds 60)))
