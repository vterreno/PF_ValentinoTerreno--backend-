FROM amazoncorretto:1.8-alpine-jdk
MAINTAINER vtportfolio
COPY target/vt-0.0.1-SNAPSHOT.jar vt-0.0.1-SNAPSHOT.jar
entrypoint ["java", "-jar", "/vt-0.0.1-SNAPSHOT.jar"]