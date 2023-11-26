# docker file used to create the docker image from the jar file.

FROM openjdk:17-oracle
ADD target/Survey-0.0.1-SNAPSHOT.jar Survey.jar

ENTRYPOINT [ "java","-jar","/Survey.jar" ]