.PHONY: run

run:
	docker run --rm \
	  -v `pwd`/src:/app/src \
	  -v `pwd`/pom.xml:/app/pom.xml \
	  -v maven_cache:/root/.m2/repository \
	  -p 8080:8080 \
	  -w /app \
	  maven:slim mvn spring-boot:run
