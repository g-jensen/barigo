(ns barigo.spec-helpers
  (:require [speclj.core :refer :all]
            [fastmath.vector :as v]))

(defn should-vec-approx [v1 v2]
  (should= (v/approx v1 3) (v/approx v2 3)))