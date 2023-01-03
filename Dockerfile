FROM amazoncorretto:8-alpine-jdk
MAINTAINER emaaristimuno
COPY target/vt-0.0.1-SNAPSHOT.jar vt-0.0.1-SNAPSHOT.jar
entrypoint ["java", "-jar", "/vt-0.0.1-SNAPSHOT.jar"]