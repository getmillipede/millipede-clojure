#!/usr/bin/env clj

(defn print-body [n]
  (println (format "%s╚═(███)═╝" (apply str (repeat (min (mod n 8) (- 8 (mod n 8))) " ")))))

(defn millipede [n]
  (println "  ╚⊙ ⊙╝")
  (dorun (map print-body (range 0 (inc n)))))

(millipede 20)
