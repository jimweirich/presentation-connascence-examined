(def array [3 5 6 8 19 29 33 45 52 62 70])

(defn binarysearch [target array]
  (loop [lo 0 hi (count array)]
    (if (<= (- hi lo) 1)
      lo
      (let [mid (int (/ (+ lo hi) 2))]
        (if (>= target (array mid))
          (recur mid hi)
          (recur lo mid))))))

(println (binarysearch 29 array))
