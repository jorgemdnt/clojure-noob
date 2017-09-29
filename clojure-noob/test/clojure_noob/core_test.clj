(ns clojure-noob.core-test
  (:require [clojure.test :refer :all]
            [clojure-noob.core :refer :all]))

(deftest adds-hundred-test
  (testing "Should add a hundred to input"
    (is (= 123 (add-hundred 23)))))

(deftest dec-maker-test
  (testing "Should create a function that decrements by the input"
    (let [dec9 (dec-maker 9)
          decremented-number (dec9 10)]
      (is (= 1 decremented-number)))))

(deftest mapset-test
  (testing "Should work like map, but returning a set"
    (let [input [1 1 2 2]
          returned-set #{2 3}]
      (is (= returned-set (mapset inc input))))))
