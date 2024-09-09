# spring-distributed-tracing


It is related to springboot-3 which uses micrometer instead of sleuth.

- Run spring project
- Run zipkin using: docker run -d -p 9411:9411 openzipkin/zipkin
- Invoke spring hello api using 'http://localhost:8080/hello' and then see the consol-log.
- Visit localhost:9411/ to see the log infos in zipkin.