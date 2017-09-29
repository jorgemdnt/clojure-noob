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

(defn square-largest-two
  [nums]
  (map #(Math/sqrt %) (find-largest-two nums)))
