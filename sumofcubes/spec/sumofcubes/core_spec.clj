(ns sumofcubes.core-spec
  (:require [speclj.core :refer :all]
            [sumofcubes.core :refer :all]))

(describe "sum of cubes"
  (it "should give a correct answer given 100"
    (should= 4 (find-nb 100)))
  (it "should give a correct answer given 4183059834009"
    (should= 2022 (find-nb 4183059834009)))
  (it "should give a correct answer given 24723578342962"
    (should= (find-nb 24723578342962) -1))
  (it "should give a correct answer given 135440716410000"
    (should= (find-nb 135440716410000) 4824))
  (it "should give a correct answer given 40539911473216"
    (should= (find-nb 40539911473216) 3568)))

(describe "binomial"
  (it "should give a correct answer given 1"
    (should= 1 (binomial 1)))
  (it "should give a correct answer given 2"
    (should= 3 (binomial 2)))
  (it "should give a correct answer given 3"
    (should= 6 (binomial 3)))
  (it "should give a correct answer given 4"
    (should= 10 (binomial 4)))
  (it "should give a correct answer given 5"
    (should= 15 (binomial 5))))
