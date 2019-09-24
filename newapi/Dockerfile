FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/newapi-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} newapi-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/newapi-1.0-SNAPSHOT.jar"]