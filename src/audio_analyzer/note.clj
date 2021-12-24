(ns audio-analyzer.note)

(def notes ["A" "A#" "B" "C" "C#" "D" "D#" "E" "F" "F#" "G" "G#"])

(defn- approx-freq? [target steps]
  (< (Math/abs (- target
                  (* 55
                     (Math/pow 2
                               (+ 3 (/ steps 12))))))
     5))

(defn- approx-freq [n]
  (let [a (Math/pow 2 1/12)
      iterator (if (> n 440) inc dec)]
  (loop [x 0]
    (if (approx-freq? n x)
      x
      (recur (iterator x))))))

(defn freq->note
  "Convert a frequency to a musical note of the equal tempered scale"
  [n]
  (notes (rem (+
               (approx-freq n)
               (* 12 2))
              12)))
