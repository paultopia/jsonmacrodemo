(ns jsonmacrodemo.core
  (:require [reagent.core :as reagent])
  (:require-macros [jsonmacrodemo.macro :as m]))

;; -------------------------
;; Views

(def data (m/get-data "json.json"))

(defn home-page []
  [:div [:h2 (:greeting data)]])

;; -------------------------
;; Initialize app

(defn mount-root []
  (reagent/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
