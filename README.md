# spring-boot-app

Spring Boot Application Examples
---

### How to Start 

+ Sure that you have necessary environments(**Redis**, **MySQL**), please see [application-default.yml](src/main/resources/application-default.yml).
    
+ Run commands:

    
    ```
    mvn clean package -DskipTests
    ./target/spring-boot-app-1.0.0-SNAPSHOT.jar
    ```


### More Important

+ You'd better to understand the [pom.xml](pom.xml);

+ **application-*.yml** is the different profiles;

+ [META-INF/spring-boot-devtools.properties](src/main/resources/META-INF/spring-boot-devtools.properties) is the **spring-boot-devtools**'s config file.

+ [logback-spring.xml](src/main/resources/logback-spring.xml) is the **log** config by different profiles;

+ [banner.txt](src/main/resources/banner.txt) overrides the default **Spring Boot Banner**;