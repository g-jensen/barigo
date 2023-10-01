(ns barigo.camera
  (:require [barigo.util :as util]))

(defn ->cam [pos target]
  {:pos pos
   :rot  target})

#_(defn forward [cam]
  (let [target  (util/quat->euler (:rot cam))
        forward (v/sub target (:pos cam))
        mag     (v/mag forward)]
    (v/div forward mag)))