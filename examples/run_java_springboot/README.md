## **Spring-Boot Java with maven** application

gazr spec implementation status in this example

- [x] style
- [x] complexity
- [x] format
- [x] test
- [x] test-unit
- [ ] test-functional
- [ ] test-integration
- [x] run
- [x] watch

### Start the Spring boot unit tests.

```bash
make test
```

### Check the style of the code with fmt-maven-plugin

```bash
make style
```

### Check the complexity of the code with checkstyle

```bash
make complexity
```

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

You can then access the webapp at http://localhost:8080/hello

If for instance you change some content in `ExampleService.java` and
recompile in your IDE, the change is seen live in the browser as
soon as you refresh the page.

**Files:**

* [generate_maven_settings](generate_maven_settings) generates the proper
  `settings.xml` file for maven depending on your proxy environment variables
* [Makefile](Makefile) passes this file as a volume so the maven inside the
  container can download dependencies

  Note: in the Makefile, docker is started with
  `-v maven_cache:/root/.m2/repository`.
  This allows to store the maven cache in a docker named volume.
  This volume is shared with other containers on the docker host.

  To share it with a possible maven cache at the host level, or to have a
  dedicated folder, you would use instead (note the leading slash):
  `-v /path/on/host:/root/.m2/repository`.


**[See other examples](/tree/master/examples)**
