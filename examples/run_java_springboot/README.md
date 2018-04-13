Run **Spring-Boot Java with maven** application

```bash
make run
```

Note: in the Makefile, docker is started with
`-v maven_cache:/root/.m2/repository`.
This allows to store the maven cache in a docker named volume.
This volume is shared with other containers on the docker host.

To share it with a possible maven cache at the host level, or to have a
dedicated folder, you would use instead (note the leading slash):
`-v /path/on/host:/root/.m2/repository`.

You can then access the webapp at http://localhost:8080

**Files:**

* [Makefile](Makefile)

**[See other examples](/tree/master/examples)**
