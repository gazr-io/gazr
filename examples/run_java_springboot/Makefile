.PHONY: run watch test-unit test format style complexity


run: watch

watch: prepare
	mvn spring-boot:run

test-unit: prepare
	mvn test

test: test-unit

format: prepare
	mvn fmt:format

style: prepare
	mvn fmt:check

complexity: prepare
	mvn validate


prepare:
	./generate_maven_settings
	alias mvn="docker run --rm \
		-v `pwd`/src:/app/src \
		-v `pwd`/pom.xml:/app/pom.xml \
		-v `pwd`/settings.xml:/root/.m2/settings.xml \
		-v maven_cache:/root/.m2/repository \
		-p 8080:8080 \
		-w /app \
		maven:slim mvn"

