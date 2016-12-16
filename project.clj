(defproject mafiaway "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.seleniumhq.selenium/selenium-java "3.0.1"]]
  :main ^:skip-aot mafiaway.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  #_:resource-paths #_["resources/client-combined-3.0.1-nodeps.jar"]
)
