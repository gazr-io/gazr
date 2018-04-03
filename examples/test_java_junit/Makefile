.PHONY: test
test: test-unit

test-unit:
	docker run --rm \
	  -v `pwd`/src:/app/src \
	  -v `pwd`/pom.xml:/app/pom.xml \
	  -w /app \
	  maven:slim mvn test
