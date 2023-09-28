(ns barigo.camera-spec
  (:require [barigo.util :as util]
            [barigo.world :as w]
            [barigo.spec-helpers :refer :all]
            [fastmath.core :as math]
            [fastmath.vector :as v]
            [speclj.core :refer :all]
            [barigo.camera :as sut]))

(describe "Camera"
  (context "calculates the normalized forward vector in camera space"
    (it "for a forward (+y) facing camera"
      (let [cam (sut/->cam (v/vec3) w/forward)]
        (should-vec-approx (v/->Vec3 0 1 0)
          (sut/forward cam))))

    (it "for an upward (+z) facing camera"
      (let [cam (sut/->cam (v/vec3) w/up)]
        (should-vec-approx (v/->Vec3 0 0 1)
          (sut/forward cam))))

    (it "for a forward facing camera with offset x + 1"
      (let [cam (sut/->cam (v/vec3 1 0 0) w/forward)]
        (should-vec-approx (v/vec3 (- math/SQRT2_2) math/SQRT2_2 0)
          (sut/forward cam))))

    (it "for an arbitrarily facing camera with offset"
      (let [cam (sut/->cam (v/vec3 1 1 0) (v/vec3 1 1 0))]
        (should-vec-approx w/up
          (sut/forward cam))))))