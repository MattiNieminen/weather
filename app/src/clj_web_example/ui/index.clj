(ns clj-web-example.ui.index
  (:require [clojure.java.io :as io]
            [hiccup.page :as page])
  (:import [org.apache.commons.codec.digest DigestUtils]))

(def index-page
  (page/html5
    [:head
     [:title "clj-web-example"]
     [:meta {:charset "utf-8"}]
     [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
     [:meta {:name "viewport"
             :content "width=device-width, initial-scale=1.0"}]]
    [:body
     [:div#app]
     (page/include-js "/static/js/main.js")]))
