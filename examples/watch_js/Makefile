.PHONY: watch
watch:
	docker build -t gazr_js_watch .
	# Here with a share volume between the container and your laptop
	docker run -it -v $(PWD)/app:/usr/src/app/app gazr_js_watch ./node_modules/.bin/nodemon
	# Here an example without volume
	# docker run -it gazr_js_watch ./node_modules/.bin/nodemon
