FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/old-api-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} old-api-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/old-api-1.0-SNAPSHOT.jar"]