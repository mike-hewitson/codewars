(ns sumofcubes.core-spec
  (:require [speclj.core :refer :all]
            [sumofcubes.core :refer :all]))

(describe "sum of cubes"
  (it "should give a correct answer"
    (should= (find-nb 4183059834009) 2022)
    (should= (find-nb 24723578342962) -1)
    (should= (find-nb 135440716410000) 4824)
    (should= (find-nb 40539911473216) 3568)))
