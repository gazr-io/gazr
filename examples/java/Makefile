.PHONY: test
test: test-unit

test-unit:
	docker run --rm \
	  -v `pwd`/src:/app/src \
	  -v `pwd`/pom.xml:/app/pom.xml \
	  -v ~/.m2/repository:/root/.m2/repository \
	  -w /app \
	  maven:slim mvn test
