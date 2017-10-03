FROM clojure
RUN mkdir -p /srv/clojure-noob
WORKDIR /srv/clojure-noob
ADD clojure-noob /srv/clojure-noob
RUN lein deps
