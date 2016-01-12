(ns sieve-of-eratosthenes.core
  (:use clojure.set))

(defn make-inclusive-range [n]
  (range 2 (+ n 1)))

(defn find-multiples-of [p inbound]
  (filter (fn [x] (= 0 (mod x p))) inbound))

(defn eliminate-multiples [inbound]
  (let [lowest (apply min inbound)
        multiples (find-multiples-of lowest inbound)]
    doall difference '(3 5 7 9 11 13 15) '(3 6 9 12 15)))


;(defn find-primes-through [x]
;  (make-inclusive-range x))

