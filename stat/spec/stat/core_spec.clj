(ns stat.core-spec
  (:require [speclj.core :refer :all]
            [stat.core :refer :all]))


(describe "component tests"
  (it "should split up a time format hh|mm|ss into totals seconds"
    (should= (split-time "01|15|59")
           4559)
    (should= (split-time "00|25|59")
           1559))
  (it "should join up a time from seconds format into hh|mm|ss"
    (should= "01|15|59" (join-time 4559))
    (should= "00|25|59" (join-time 1559))))

(describe "full system tests"
  (it "should work"
    (should= (stat "01|15|59, 1|47|16, 01|17|20, 1|32|34, 2|17|17")
           "Range: 01|01|18 Average: 01|38|05 Median: 01|32|34")
    (should= (stat "02|15|59, 2|47|16, 02|17|20, 2|32|34, 2|17|17, 2|22|00, 2|31|41")
           "Range: 00|31|17 Average: 02|26|18 Median: 02|22|00")))
