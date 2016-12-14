(ns rotations.core-test
  (:require [clojure.test :refer :all]
            [rotations.core :refer :all]))
(require 'clojure.set)

(defn test-assert [act exp]
  (is (= act exp)))

(deftest a-test1
  (testing "contain-all-rots"
    (test-assert (contain-all-rots "bsjq" ["bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs"]) true)
    (test-assert (contain-all-rots "" []) true)
    (test-assert (contain-all-rots "" ["bsjq", "qbsj"]) true)
    (test-assert (contain-all-rots "XjYABhR" ["TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY"]) false)))
