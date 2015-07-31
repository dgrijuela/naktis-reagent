(ns naktis-cljs.prod
  (:require [naktis-cljs.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
