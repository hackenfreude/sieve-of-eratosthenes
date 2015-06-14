(ns sieve-of-eratosthenes.core-test
  (:use midje.sweet)
  (:require [sieve-of-eratosthenes.core :refer :all]))

(fact "make-inclusive-range returns empty when n < 2"
      (let [result (make-inclusive-range 1)]
        result => empty?))

(fact "make-inclusive-range returns 2 when n = 2"
      (let [result (make-inclusive-range 2)]
        result => (just '(2))))

(fact "make-inclusive-range returns 2 through n when n > 2"
      (let [result (make-inclusive-range 4)]
        result => (just [2 3 4])))

(fact "get-multiples-through returns 1 through 10 when p=1 and n=10"
      (let [result (get-multiples-through 1 10)]
        result => (just [1 2 3 4 5 6 7 8 9 10])))

(fact "get-multiples-through returns 5, 10, 15 when p=5 and n=17"
      (let [result (get-multiples-through 5 17)]
        result => (just [5 10 15])))

