(ns mafiaway.timestamp)

(defn get-stamp [ & [seconds] ]
  (let [now (.getTime (java.util.Date.))]
    (if seconds
      (+ now (long (* 1000 seconds)))
      now)))
