FROM openjdk:8
ADD jvm.options /config/
ADD target/test-0.0.1-SNAPSHOT.jar /config/dropins/
