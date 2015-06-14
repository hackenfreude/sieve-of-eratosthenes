(ns sieve-of-eratosthenes.core-test
  (:use midje.sweet)
  (:require [sieve-of-eratosthenes.core :refer :all]))

(fact "make-range returns empty when n < 2"
      (let [result (make-inclusive-range 1)]
        result => empty?))

(fact "make-range returns 2 when n = 2"
      (let [result (make-inclusive-range 2)]
        result => (just '(2))))

(fact "make-range returns 2 through n when n > 2"
      (let [result (make-inclusive-range 4)]
        result => (just [2 3 4])))

