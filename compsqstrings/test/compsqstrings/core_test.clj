(ns compsqstrings.core-test
  (:require [clojure.test :refer :all]
            [compsqstrings.core :refer :all]))

(defn test-assert [act exp]
  (is (= act exp)))

(deftest a-test1
  (testing "compose"
    (test-assert (compose "byGt\nhTts\nRTFF\nCnnI", "jIRl\nViBu\nrWOb\nNkTB"), "bNkTB\nhTrWO\nRTFVi\nCnnIj")
    (test-assert (compose "HXxA\nTGBf\nIPhg\nuUMD", "Hcbj\nqteH\nGbMJ\ngYPW"), "HgYPW\nTGGbM\nIPhqt\nuUMDH")
    (test-assert (compose "tSrJ\nOONy\nsqPF\nxMkB", "hLqw\nEZuh\nmYFl\nzlYf"), "tzlYf\nOOmYF\nsqPEZ\nxMkBh")))
