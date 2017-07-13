(ns countmultiples.core-test
  (:require [midje.sweet :refer :all]
            [countmultiples.core :refer :all]))


(facts "a-test1"
       (fact "basic tests"
         (count-spec-mult 2 100) => 16N
         (count-spec-mult 2 1000) => 166N
         (count-spec-mult 2 10000) => 1666N
         (count-spec-mult 2 100000) => 16666N
         (count-spec-mult 3 100) => 3N))


