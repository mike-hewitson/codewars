(ns skin-a-cat-test
  (:require [clojure.test :refer :all]
            [skin-a-cat.core :refer :all]))

(deftest basic-test
 (testing "two parameters"
   (is (= (sum 5 5) 10)))
 (testing "one parameter"
   (is (= ((sum 5) 5) 10))))
