.PHONY: complexity
complexity:
	docker build -t gazr_python_xenon .
	docker run gazr_python_xenon xenon --ignore "tests" --max-absolute B --max-modules A --max-average A .
