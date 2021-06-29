FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/cicddemo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jgit ar","app.jar"]