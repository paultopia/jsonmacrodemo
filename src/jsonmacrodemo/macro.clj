(ns jsonmacrodemo.macro
  (:require [cheshire.core :refer [parse-string]]
            [selmer.parser :refer [render-file render]]
            [hickory.core :refer [parse-fragment as-hiccup]]))

(defmacro get-data [jsonfile]
  (parse-string (slurp jsonfile) true))

(defn buildside-get-data [jsonfile]
  (parse-string (slurp jsonfile) true))

(defmacro from-template [template jsonfile]
  (first (map as-hiccup (parse-fragment (render (slurp template) (buildside-get-data jsonfile))))))

; for some strange reason, slurp can find template.html on the classpath but selmer's render-file cannot. So I'm just using slurp and render. 
