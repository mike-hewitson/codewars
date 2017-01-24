(ns sumofcubes.core-spec
  (:require [speclj.core :refer :all]
            [sumofcubes.core :refer :all]))

(describe "sum of cubes"
  (it "should give a correct answer given 100"
    (should= 4 (find-nb 100)))
  (it "should give a correct answer given 4183059834009"
    (should= (find-nb 4183059834009) 2022))
  (it "should give a correct answer given 24723578342962"
    (should= (find-nb 24723578342962) -1))
  (it "should give a correct answer given 135440716410000"
    (should= (find-nb 135440716410000) 4824))
  (it "should give a correct answer given 40539911473216"
    (should= (find-nb 40539911473216) 3568)))
