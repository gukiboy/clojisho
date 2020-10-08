(ns clojisho.core
  (:require [clj-http.client :as client])
  (:gen-class))

(def base-url "http://jisho.org/api/v1")


(defn search-keyword
  [word]
  (let [raw-response (client/get (str base-url "/search/words?keyword=" word) 
                                 {:as :json})
        body (:body raw-response)]
    (:body raw-response)))

(search-keyword "egg")

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
