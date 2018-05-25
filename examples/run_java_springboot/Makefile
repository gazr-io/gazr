.PHONY: run test format


run: prepare
	mvn spring-boot:run

test: prepare
	mvn test

format: prepare
	mvn fmt:format


prepare:
	./generate_maven_settings
	alias mvn="docker run --rm \
		-v `pwd`/src:/app/src \
		-v `pwd`/pom.xml:/app/pom.xml \
		-v `pwd`/settings.xml:/root/.m2/settings.xml \
		-v maven_cache:/root/.m2/repository \
		-p 8080:8080 \
		-w /app \
		maven:slim mvn spring-boot:run"

