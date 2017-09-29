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

(deftest find-largest-two-test
  (testing "Should return largest and second largest numbers in collection"
    (let [number-list [32 2413 432 1 3 9999]]
      (is (= [9999 2413] (find-largest-two number-list))))))

(deftest square-largest-two-test
  (testing "Should return collection with square roots of largest two numbers in collection"
    (let [number-list [1 121 9 3 12 36 12]]
      (is (= [11.0 6.0] (square-largest-two number-list))))))
