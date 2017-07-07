(ns minnbdiv.core-test
  (:require [midje.sweet :refer :all]
            [minnbdiv.core :refer :all]))


(facts "the given tests"
       (fact "Basic tests"
         (find-min-num 7) => 64
         (find-min-num 8) => 24
         (find-min-num 9) => 36
         (find-min-num 6) => 12))


