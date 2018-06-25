Stage 1 - Initial Setup
- Java FW - Spring Boot/ Spring Cloud
 - API Gateway -> Zuul
 - Load Balancer -> Ribbon
 - Service Registry - Eureka
 - Rest Client (abstraction) -> Feign
 - searching, analyzing, and visualizing log data -> ELK (Elasticsearch, Logstash, Kibana)
 - security -> Okta Oath2
 - distributed tracing system -> Zipkin

Stage 2 - Optimize
- redundant zuul
- Integrate NginX with zuul
- Swap Service Registry to Zookeeper
- Create Containers (Docker)

Stage 3 - 
- layer 4 LB - ELB
- Orchestrate -> Kubernetes
- OpenSwift?
- AWS (EC2)


TBD
- DB
