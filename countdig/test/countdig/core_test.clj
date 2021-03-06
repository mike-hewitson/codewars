(ns countdig.core-test
  (:require [clojure.test :refer :all]
            [countdig.core :refer :all]))

(defn test-assert [act exp]
  (is (= act exp)))

(deftest a-test1
  (testing "nb-dig"
     (test-assert(nb-dig 5750, 0), 4700)
     (test-assert(nb-dig 11011, 2), 9481)
     (test-assert(nb-dig 12224, 8), 7733)
     (test-assert(nb-dig 11549, 1), 11905)))
