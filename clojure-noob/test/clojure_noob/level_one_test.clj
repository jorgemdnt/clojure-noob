(ns clojure-noob.level-one-test
  (:require [clojure.test :refer :all]
            [clojure-noob.level-one :refer :all]))

(defn- close-enough
  [x y]
  (< (Math/abs (- x y)) 0.001))

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

(deftest square-root-test
  (testing "Should return square-root-root of 9"
    (is (close-enough 3.0 (square-root 9))))
  (testing "Should return square-root-root of 121"
    (is (close-enough 11.0 (square-root 121))))
  (testing "Should return non-integer square-root-root of 33"
    (is (close-enough 5.744 (square-root 33)))))

(deftest square-root-largest-two-test
  (testing "Should return collection with square-root roots of largest two numbers in collection"
    (let [number-list [1 121 9 3 12 36 12]]
      (is (= [11.0 6.0] (square-root-largest-two number-list))))))

(deftest id-test
  (testing "Should return self object passed into function"
    (is (= 20139 (id 20139)))))

(deftest compose-test
  (testing "Should compose two functions"
    (let [add-two #(+ 2 %)
          subtract-one #(- % 1)
          composed-calc (compose add-two subtract-one)]
      (is (= (add-two (subtract-one 5)) (composed-calc 5)))))
  (testing "Should respect id function"
    (let [composed-id (compose id id)]
      (is (= 5 (composed-id 5))))))
