(ns barigo.util-spec
  (:require [barigo.util :as sut]
            [barigo.world :as world]
            [speclj.core :refer :all]))

(describe "Util functions"
  (context "target->quat"
    (it "converts the forward (-z) target vector to quaternion rotation"
      (should= (sut/vec4 0 0 0 1)
        (sut/target->quat world/forward)))))