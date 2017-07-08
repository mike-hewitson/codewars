(ns moduli.core-test
  (:use midje.sweet)
  (:use [moduli.core]))


(facts "a-test1"
       (fact "1st Test"
         (fromNb2Str 187 [8 7 5 3]) => "-3--5--2--1-"))
