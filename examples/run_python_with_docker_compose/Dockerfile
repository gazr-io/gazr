FROM python:3.6

RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

ENV PYTHONPATH=/usr/src/app/

COPY . /usr/src/app

CMD [ "python", "app/app.py" ]
