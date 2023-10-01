(ns barigo.util
  (:require [uncomplicate.neanderthal.native :refer [dv]]))

(defn vec3 [x y z]
  (dv x y z))

(defn vec4 [x y z w]
  (dv x y z w))

(defn target->quat [target]
  target)