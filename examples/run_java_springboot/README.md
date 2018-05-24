## **Spring-Boot Java with maven** application

gazr spec implementation status in this example

- [ ] style
- [ ] complexity
- [x] format
- [x] test
- [ ] test-unit
- [ ] test-functional
- [ ] test-integration
- [x] run
- [ ] watch

### Start the Spring boot unit tests.

```bash
make test
```


### Format the code

```bash
make format
```

### Run the spring webapp

```bash
make run
```

You can then access the webapp at http://localhost:8080/hello

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
