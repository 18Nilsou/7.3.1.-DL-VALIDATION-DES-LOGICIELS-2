# Add test dependencies and explore the Maven lifecycle

| Cmd | Step | File | 
|-----------------------|:-------------:|:---|
| `$mvn clean` | Clean | None, the folder target/ is deleted|
| `$mvn test`  | Clean Validate Compile Test | target/maven-status/, target/classes/, target/test-classes/, target/generated-sources, target/generated-test-sources |
| `$mvn package` | Clean Validate Compile Test Package|  target/maven-archiver/, bank-application-x.x-SNAPSHOT.jar |


Run `$mvn verify` and write down your hypothesis: how is verify different from test and package?
>`$mvn verify` doesn't create any file or folder, the step is the execution of the code and the tests