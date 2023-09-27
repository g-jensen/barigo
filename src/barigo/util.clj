(ns barigo.util)

; 1) just to normalize naming conventions
; 2) will need to be replaced with ClojureCL wrappers for parallel operations
;    where appropriate as the engine develops

(defn euler->quat [euler]
  (apply fastmath.quaternion/from-euler euler))

(defn quat->euler [quat]
  (apply fastmath.quaternion/to-euler quat))