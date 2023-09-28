(ns barigo.camera
  (:require [barigo.util :as util]
            [fastmath.vector :as v]))

(defn ->cam [pos rot]
  {:pos pos
   :rot (util/euler->quat rot)})

(defn forward [cam]
  (let [target  (util/quat->euler (:rot cam))
        forward (v/sub target (:pos cam))
        mag     (v/mag forward)]
    (v/div forward mag)))