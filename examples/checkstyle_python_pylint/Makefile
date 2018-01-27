.PHONY: checkstyle
checkstyle:
	docker build -t gazr_python_pylint .
	docker run gazr_python_pylint pylint app
