(ns stat.core-test
  (:use midje.sweet)
  (:use [stat.core]))

(facts "component tests"
  (fact "should split up a time format hh|mm|ss into totals seconds"
    (split-time "01|15|59") => 4559
    (split-time "00|25|59") => 1559)
  (fact "should join up a time from seconds format into hh|mm|ss"
     (join-time 4559) => "01|15|59"
     (join-time 1559) => "00|25|59")
  (fact "should split up string into vector of times"
     (split-up-times "01|15|59, 1|47|16, 01|17|20, 1|32|34, 2|17|17") =>
        ["01|15|59" "1|47|16" "01|17|20" "1|32|34" "2|17|17"]))

(facts "full system tests"
  (fact "should work"
    (stat "01|15|59, 1|47|16, 01|17|20, 1|32|34, 2|17|17") =>
           "Range: 01|01|18 Average: 01|38|05 Median: 01|32|34"
    (stat "02|15|59, 2|47|16, 02|17|20, 2|32|34, 2|17|17, 2|22|00, 2|31|41") =>
           "Range: 00|31|17 Average: 02|26|18 Median: 02|22|00"))
