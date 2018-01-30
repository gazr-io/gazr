FROM python:3.6

RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

ENV PYTHONPATH=/usr/src/app/

RUN pip install pylint

COPY . /usr/src/app

CMD [ "python", "app/app.py" ]
