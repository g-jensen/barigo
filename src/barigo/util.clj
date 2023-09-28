(ns barigo.util
  (:require [fastmath.quaternion :as q]
            [fastmath.vector :as v]))

; 1) just to normalize naming conventions
; 2) will need to be replaced with ClojureCL wrappers for parallel operations
;    where appropriate as the engine develops

(defn euler->quat [euler]
  (q/from-euler euler))

(defn quat->euler [quat]
  (q/to-euler quat))