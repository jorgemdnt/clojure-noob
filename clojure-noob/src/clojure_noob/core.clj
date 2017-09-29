(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little Tea Pot!"))

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
