(ns haskell-array-operations.core-test
  (:require [midje.sweet                   :refer :all]
            [haskell-array-operations.core :refer :all]))


(facts "example tests"
 (fact "given tests"
  (head [5 1])     => 5
  (tail [1])       => []
  (init [1 5 7 9]) => [1 5 7]
  (last_ [7 2])    => 2))
