(ns sieve-of-eratosthenes.core)

(defn make-inclusive-range [n]
  (range 2 (+ n 1)))

(defn get-multiples-through [p n]
  (filter (fn [x] (= 0 (mod x p))) (range 1 (+ n 1))))

