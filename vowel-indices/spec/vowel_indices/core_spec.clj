(ns vowel-indices.core-spec
  (:require [speclj.core :refer :all]
            [vowel-indices.core :refer :all]))


(describe "test-vowel-indices"
  (it "should give correct answer for 'super'"
    (should= (vowel-indices "super") [2 4]))
  (it "should give correct answer for 'sUpEr'"
    (should= (vowel-indices "super") [2 4]))
  (it "should give correct answer for 'woo hoo'"
    (should= (vowel-indices "woo hoo") [2 3 6 7])))
