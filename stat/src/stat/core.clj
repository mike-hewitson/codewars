(ns stat.core
  (:require [clojure.string :as str]))

(defn time->int
  [time]
  ((fn [[hh mm ss]]
     (+ (* hh 3600) (* mm 60) ss))
   (map read-string (clojure.string/split time #"\|"))))

(defn int->time
  [seconds]
  (str (format "%02d" (quot seconds 3600)) "|"
       (format "%02d"(- (quot seconds 60) (* (quot seconds 3600) 60))) "|"
       (format "%02d" (mod seconds 60))))

(defn split-up-times
  [times]
  (str/split times #", "))

(defn mean
  [coll]
  (int (/ (reduce + coll) (count coll))))

(defn my-range
  [coll]
  (- (apply max coll) (apply min coll)))

(defn median [coll]
  (let [sorted (sort coll)
        cnt (count sorted)
        halfway (quot cnt 2)]
    (if (odd? cnt)
      (nth sorted halfway)
      (let [bottom (dec halfway)
            bottom-val (nth sorted bottom)
            top-val (nth sorted halfway)]
        (mean [bottom-val top-val])))))

(defn stat
  [times]
  (let [split-times (map time->int (split-up-times times))]
    (if (empty? times)
      ""
      (str "Range: "
           (int->time (my-range split-times))
           " Average: "
           (int->time (mean split-times))
           " Median: "
           (int->time (median split-times))))))
