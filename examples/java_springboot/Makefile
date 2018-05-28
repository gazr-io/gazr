.PHONY: run watch test-unit test-functional test format style complexity


run: watch

watch: prepare
	docker-compose up

test-unit: prepare
	mvn clean test-compile surefire:test@unit

test-functional: prepare
	mvn clean test-compile surefire:test@functional

test: prepare
	mvn clean test

format: prepare
	mvn fmt:format

style: prepare
	mvn fmt:check

complexity: prepare
	mvn validate


prepare:
	./generate_maven_settings
	alias mvn="docker-compose run web mvn"
