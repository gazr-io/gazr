.PHONY: fmt
fmt:
	docker build -t gazr_js_prettier .
	# Here with a share volume between the container and your laptop
	docker run -it -v $(PWD)/app:/usr/src/app/app \
		gazr_js_prettier ./node_modules/.bin/prettier --write "app/**/*.js"
	# Here an example without volume
	# docker run gazr_js_prettier ./node_modules/.bin/prettier --write "app/**/*.js"
