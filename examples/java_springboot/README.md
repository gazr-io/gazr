## **Spring-Boot Java with maven** application

gazr spec implementation status in this example

- [x] style
- [x] complexity
- [x] format
- [x] test
- [x] test-unit
- [x] test-functional
- [x] test-integration
- [x] run
- [x] watch

Note : you can run

```bash
make all
```

to go through all steps defined in gazr.

### Start all tests.

```bash
make test
```

Note : separation between different test kinds is possible
thanks to JUnit annotation `org.junit.experimental.categories.Category`.

### Start only (fast) unit tests.

```bash
make test-unit
```

### Start only functional tests.

```bash
make test-functional
```

### Start only integration tests.

```bash
make test-integration
```

This will start a Postgre database with docker-compose.

### Check the style of the code with fmt-maven-plugin

```bash
make style
```

### Check the complexity of the code with checkstyle

```bash
make complexity
```

This uses the file [checkstyle.xml](checkstyle.xml)
with only code complexity activated.

### Format the code with fmt-maven-plugin

```bash
make format
```

### Run the spring webapp (watching changes with spring-boot-devtools)

```bash
make run
```

or

```bash
make watch
```

This will start a Postgre database with docker-compose.

You can then access the webapp at http://localhost:8080/hotels

If for instance you change some content in `ExampleService.java` and
recompile in your IDE, the change is seen live in the browser as
soon as you refresh the page.

**Files:**

* [generate_maven_settings](generate_maven_settings) generates the proper
  `settings.xml` file for maven depending on your proxy environment variables
* [Makefile](Makefile) passes this file as a volume so the maven inside the
  container can download dependencies
* [docker-compose.yml](docker-compose.yml) defines the `db` and `web`
  containers.
  Note: in this file, docker is started with
  `-v maven_cache:/root/.m2/repository`.
  This allows to store the maven cache in a docker named volume.
  This volume is shared with other containers on the docker host.

  To share it with a possible maven cache at the host level, or to have a
  dedicated folder, you would use instead (note the leading slash):
  `-v /path/on/host:/root/.m2/repository`.


**[See other examples](/tree/master/examples)**
