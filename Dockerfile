FROM openjdk:8-jdk-alpine
ADD jvm.options /config/
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
