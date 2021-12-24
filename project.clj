(defproject audio-analyzer "0.1.0-SNAPSHOT"
  :description "Analyze audio stream to capture frequencies"
  :url "https://www.evan-duncan.com/audio"
  :license {:name "AGPL-3.0-or-later"
            :url "https://www.gnu.org/licenses/agpl-3.0.en.html"}
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :main ^:skip-aot audio-analyzer.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
