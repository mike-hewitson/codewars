(ns moduli.core-test
  (:use midje.sweet)
  (:use [moduli.core]))


(facts "a-test1"
       (fact "1st Test"
         (fromNb2Str 187 [8 7 5 3]) => "-3--5--2--1-"
         (fromNb2Str 11 [2 3 5]) => "-1--2--1-"
         (fromNb2Str 6 [2 3 4]) => "Not applicable"
                                        ;since 2 and 4 are not coprime
         (fromNb2Str 7 [2 3]) => "Not applicable"
                                        ;since 2 * 3 < 7
         ))
