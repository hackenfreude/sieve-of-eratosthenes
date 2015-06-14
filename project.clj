(defproject sieve-of-eratosthenes "0.1.0-SNAPSHOT"
  :description "a toy prime number project... in clojure"
  :license {:name "The MIT License"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :profiles {:dev {:dependencies [[midje "1.6.3"]]}}
  :plugins [[lein-midje "3.1.3"]]
  :test-paths ["test"])

