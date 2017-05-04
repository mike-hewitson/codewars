(ns stat.core
  (:require [clojure.string :as str]))

(defn split-time
  [time]
  ((fn [[hh mm ss]]
     (+ (* hh 3600) (* mm 60) ss))
   (map read-string (clojure.string/split time #"\|"))))

(defn join-time
  [seconds]
  (str (format "%02d" (quot seconds 3600)) "|"
       (- (quot seconds 60) (* (quot seconds 3600) 60)) "|"
       (mod seconds 60)))

(defn split-up-times
  [times]
  (str/split times #", "))

(defn average
  [coll]
  (Math/round (float (/ (reduce + coll) (count coll)))))

(defn stat
  [times]
  (str " Average: "
       (join-time (average (map split-time (split-up-times times))))))
