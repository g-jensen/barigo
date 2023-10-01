(ns barigo.world
  (:require [barigo.util :refer [vec3]]))

(def forward (vec3 0 0 -1))
(def up      (vec3 0 1  0))
(def right   (vec3 1 0  0))