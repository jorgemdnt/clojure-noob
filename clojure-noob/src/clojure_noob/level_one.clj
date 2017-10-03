(ns clojure-noob.level-one)

(defn add-hundred
  [number]
  (+ number 100))

(defn dec-maker
  "Creates a decrement function"
  [decrementor]
  (fn
    [x]
    (- x decrementor)))

(defn mapset
  [function a-list]
  (into #{} (map function a-list)))

(defn find-largest-two
  [nums]
  (loop [number-list nums
         largest Integer/MIN_VALUE
         sec-largest Integer/MIN_VALUE]
    (if (empty? number-list)
      [largest sec-largest]
      (let [head (first number-list)]
        (recur
          (rest number-list)
          (if (> head largest)
            head
            largest)
          (cond
            (> head largest) largest
            (and (> head sec-largest) (> largest head)) head
            :else sec-largest))))))

(defn- absolute
  [x]
  (if (< x 0)
    (* x -1)
    x))

(defn- square
  [x]
  (* x x))

(defn- good-enough?
  [guess x]
  (< (absolute (- (square guess) x)) 0.001))

(defn- average
  [x y]
  (/ (+ x y) 2))

(defn- improve
  [guess x]
  (average guess (/ x guess)))

(defn- square-root-iter
  [guess x]
  (loop [guessing guess]
    (if (good-enough? guessing x)
      guessing
      (recur (improve guessing x)))))

(defn square-root
  [x]
  (square-root-iter 1.0 x))

(defn square-root-largest-two
  [nums]
  (map #(Math/sqrt %) (find-largest-two nums)))

(defn id
  [x]
  x)

(defn compose
  [f g]
  #(-> % g f))
