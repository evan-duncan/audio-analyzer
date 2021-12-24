(ns audio-analyzer.note-test
  (:require  [clojure.test :refer [deftest is testing]]
             [audio-analyzer.note :refer [freq->note]]))

(deftest frequencies-to-notes
  (testing "Proper conversion when frequency is higher than base"
    (is (= (freq->note 440) "A"))
    (is (= (freq->note 523) "C"))
    (is (= (freq->note 880) "A")))
  (testing "Proper conversion when frequency is lower than base"
    (is (= (freq->note 220) "A"))
    (is (= (freq->note 261) "C"))))
