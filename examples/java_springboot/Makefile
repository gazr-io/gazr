.PHONY: run watch test-unit test-functional test-integration test format style complexityall prepare


run: watch

watch: prepare
	docker-compose up web db

test-unit: prepare
	docker-compose run web mvn clean test-compile surefire:test@unit

test-functional: prepare
	docker-compose run web mvn clean test-compile surefire:test@functional

test-integration: prepare
	docker-compose start db
	docker-compose run web mvn clean test-compile surefire:test@integration
	docker-compose stop db

test: prepare
	docker-compose start db
	docker-compose run web mvn test
	docker-compose stop db

format: prepare
	docker-compose run web mvn fmt:format

style: prepare
	docker-compose run web mvn fmt:check

complexity: prepare
	docker-compose run web mvn validate

all: style format complexity test-unit test-functional test-integration test run


prepare:
	./generate_maven_settings
