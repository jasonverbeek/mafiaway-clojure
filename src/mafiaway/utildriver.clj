(ns mafiaway.utildriver
  (:require [clojure.string :as string])
  (:import [org.openqa.selenium.firefox FirefoxDriver]))

(defn element-by-tag-name [driver tag-name]
  (.findElementByTagName driver tag-name))

(defn element-by-name [driver name]
  (.findElementByName driver name))

(defn click [element] 
  (.click element))

(defn clear [element]
  (.clear element))

(defn get-text [element]
  (.getText element))

(defn get-url [driver]
  (.getCurrentUrl driver))

(defn element-by-xpath [driver xpath]
  (.findElementByXPath driver xpath))

(defn new-driver []
  (FirefoxDriver.))

(defn navigate [driver url]
  (.get driver url))

(defn in-page [driver text]
  (string/includes? (.getPageSource driver) text))

(defn submit [element]
  (.submit element))

(defn send-keys [element keys do-clear]
  (when do-clear
    (clear element))
  (.sendKeys element (into-array [keys])))
