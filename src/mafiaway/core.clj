(ns mafiaway.core
  (:gen-class)
  (:require [mafiaway.utildriver :refer :all]
            [mafiaway.timestamp :refer :all])
  )

(def cd-crime (atom (get-stamp)))
(def cd-vehicle (atom (get-stamp)))
(def cd-hostage (atom (get-stamp)))
(def cd-protection (atom (get-stamp)))
(def op-crime (atom "R1"))
(def op-vehicle (atom "g1"))
(def op-hostage (atom "g1"))
(def cd-low (atom 90))

(defn sleep [s]
  (Thread/sleep (* 1000 s)))

(defn beep [] 
  (println (char 7))
  (sleep 5))

(defn captcha [driver]
  (true? (in-page driver "captcha")))

(defn engine [driver]
  (loop [] 
    (if (captcha driver)
      (beep)
      (do      
        (when (> (get-stamp) @cd-protection)
          (println "protections"))
        (when (> (get-stamp) @cd-crime)
          (println "crime"))))
    (recur)))

(defn -main []
  (def driver (new-driver))
  (navigate driver "http://www.mafiaway.nl/")
  (engine driver)
  (.quit driver))
