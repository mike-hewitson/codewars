(ns vowel-indices.test
  (:require [clojure.test :refer :all])
  (:use [vowel-indices :only [vowel-indices]]))


(defn test-assert [act exp]
  (is (= act exp)))

(deftest test-vowel-indices
  (testing "vowel-indices"
     (test-assert(vowel-indices "super"), [2,4])))
