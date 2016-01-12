(ns sieve-of-eratosthenes.core-test
  (:use midje.sweet)
  (:require [sieve-of-eratosthenes.core :refer :all]))

(fact "make-inclusive-range returns empty when n < 2"
      (let [result (make-inclusive-range 1)]
        result => empty?))

(fact "make-inclusive-range returns 2 when n = 2"
      (let [result (make-inclusive-range 2)]
        result => (just [2])))

(fact "make-inclusive-range returns 2 through n when n > 2"
      (let [result (make-inclusive-range 4)]
        result => (just [2 3 4])))

(fact "find-multiples-of returns 2 through 10 when p=1 and n=10"
      (let [inbound (make-inclusive-range 10)
            result (find-multiples-of 1 inbound)]
        result => (just [2 3 4 5 6 7 8 9 10])))

(fact "find-multiples-of returns 5, 10, 15 when p=5 and n=17"
      (let [inbound (make-inclusive-range 17)
            result (find-multiples-of 5 inbound)]
        result => (just [5 10 15])))

(fact "find-candidates returns 5,7,11,13 when passed 3,5,7,9,11,13,15"
      (let [candidates (range 3 16 2)
            result (eliminate-multiples candidates)]
        result => (just [5 7 11 13])))

;(fact "find-primes-through 3 returns 2, 3"
;      (let [result (find-primes-through 3)]
;        result => (just [2 3])))

