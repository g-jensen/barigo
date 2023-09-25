(ns barigo.main
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn settings []
  (q/smooth 2))

(defn setup []
  {})

(defn update [state]
  state)

(defn draw [state]
  (q/background 255)
  (q/rect 10 10 10 10))

(defn -main [& args]
  (q/defsketch barigo
               :size [500 500]
               :settings settings
               :setup setup
               :update update
               :draw draw
               :middleware [m/fun-mode]))