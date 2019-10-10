FROM openjdk:8u212-jdk-slim
VOLUME /tmp
EXPOSE 8080 
ARG JAR_FILE=target/test-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} test.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/test.jar"]
