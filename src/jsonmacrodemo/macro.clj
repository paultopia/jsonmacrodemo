(ns jsonmacrodemo.macro
  (:require [cheshire.core :refer [parse-string]]))

(defmacro get-data [jsonfile]
  (parse-string (slurp jsonfile) true))
