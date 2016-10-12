(defproject com.github.reifyhealth/raven-clj "1.4.4"
  :description "Sentry clojure client"
  :url "https://github.com/reifyhealth/raven-clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [cheshire "5.0.1"]
                 [clj-http "3.0.1"]
                 [prone "1.0.1"]]
  :deploy-repositories [["clojars" {:sign-releases false}]])